package com.ruoyi.web.controller.hospital;

import java.util.List;

import com.ruoyi.common.utils.JudgeAttributesIsEqualedUtil;
import com.ruoyi.hospital.domain.YPatieninfoModify;
import com.ruoyi.hospital.domain.YPatient;
import com.ruoyi.hospital.service.IYPatieninfoModifyService;
import com.ruoyi.hospital.service.IYPatientService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.hospital.domain.YPatientinfo;
import com.ruoyi.hospital.service.IYPatientinfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * 患者信息登记Controller
 * 
 * @author lwl
 * @date 2020-06-22
 */
@Controller
@RequestMapping("/hospital/patientinfo")
public class YPatientinfoController extends BaseController
{
    private String prefix = "hospital/patientinfo";

    public JudgeAttributesIsEqualedUtil<YPatientinfo> t;

    @Autowired
    private IYPatientinfoService yPatientinfoService;

    @Autowired
    private IYPatientService yPatientService;

    @Autowired
    private IYPatieninfoModifyService yPatieninfoModifyService;

    @RequiresPermissions("hospital:patientinfo:view")
    @GetMapping()
    public String patientinfo()
    {
        return prefix + "/patientinfo";
    }

    /**
     * 查询患者信息登记列表
     */
    @RequiresPermissions("hospital:patientinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(YPatientinfo yPatientinfo)
    {
        startPage();
        List<YPatientinfo> list = yPatientinfoService.selectYPatientinfoList(yPatientinfo);
        return getDataTable(list);
    }

    /**
     * 导出患者信息登记列表
     */
    @RequiresPermissions("hospital:patientinfo:export")
    @Log(title = "患者信息登记", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(YPatientinfo yPatientinfo)
    {
        List<YPatientinfo> list = yPatientinfoService.selectYPatientinfoList(yPatientinfo);
        ExcelUtil<YPatientinfo> util = new ExcelUtil<YPatientinfo>(YPatientinfo.class);
        return util.exportExcel(list, "patientinfo");
    }

    /**
     * 新增患者信息登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存患者信息登记
     */
    @RequiresPermissions("hospital:patientinfo:add")
    @Log(title = "患者信息登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(YPatientinfo yPatientinfo, YPatient yPatient)
    {
        int num = yPatientinfoService.insertYPatientinfo(yPatientinfo);
        long p = yPatientinfo.getPid();
        yPatient.setPid(p);
        //插入病人信息表
        yPatientService.insertYPatient(yPatient);
        return toAjax(num);
    }

    /**
     * 修改患者信息登记
     */
    @GetMapping("/edit/{pid}")
    public String edit(@PathVariable("pid") Long pid, ModelMap mmap)
    {
        YPatientinfo yPatientinfo = yPatientinfoService.selectYPatientinfoById(pid);
        mmap.put("yPatientinfo", yPatientinfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存患者信息登记
     */
    @RequiresPermissions("hospital:patientinfo:edit")
    @Log(title = "患者信息登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(YPatientinfo yPatientinfo,YPatient yPatient)
    {
        //获得两个对象
        YPatientinfo old = yPatientinfoService.selectYPatientinfoById(yPatientinfo.getPid());
        YPatieninfoModify yPatieninfoModify = new YPatieninfoModify();
        String str = t.contrastObj(old, yPatientinfo);
        if (str.equals("")) {
            System.out.println("未有改变");
        } else {
            System.out.println(str);
            yPatieninfoModify.setModifyid(yPatientinfo.getPid());
            yPatieninfoModify.setModifyinfo(str);
            yPatieninfoModify.setOperperson(yPatientinfo.getOperperson());
            yPatieninfoModify.setOperdate(yPatientinfo.getOperdate());
        }
        //插入修改表
        yPatieninfoModifyService.insertYPatieninfoModify(yPatieninfoModify);
        //更新病人信息表
        yPatientService.updateYPatient(yPatient);
        return toAjax(yPatientinfoService.updateYPatientinfo(yPatientinfo));
    }

    /**
     * 删除患者信息登记
     */
    @RequiresPermissions("hospital:patientinfo:remove")
    @Log(title = "患者信息登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(yPatientinfoService.deleteYPatientinfoByIds(ids));
    }

    /**
     * 增加查询陪护人员
     */
    @RequiresPermissions("hospital:patientinfo:list")
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap)
    {
        mmap.put("patient", yPatientinfoService.selectYPatientinfoById(id));
        mmap.put("patientList", yPatientinfoService.selectYPatientinfoAll());
        return "hospital/accompany/accompany";
    }
}
