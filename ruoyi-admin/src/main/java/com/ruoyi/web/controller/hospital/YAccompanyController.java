package com.ruoyi.web.controller.hospital;

import java.util.List;

import com.ruoyi.hospital.domain.YPatient;
import com.ruoyi.hospital.service.IYPatientService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.hospital.domain.YAccompany;
import com.ruoyi.hospital.service.IYAccompanyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 陪护信息登记Controller
 * 
 * @author lwl
 * @date 2020-06-22
 */
@Controller
@RequestMapping("/hospital/accompany")
public class YAccompanyController extends BaseController
{
    private String prefix = "hospital/accompany";

    @Autowired
    private IYAccompanyService yAccompanyService;
    @Autowired
    private IYPatientService yPatientService;

    @RequiresPermissions("hospital:accompany:view")
    @GetMapping()
    public String accompany()
    {
        return prefix + "/accompany";
    }

    /**
     * 查询陪护信息登记列表
     */
    @RequiresPermissions("hospital:accompany:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(YAccompany yAccompany)
    {
        startPage();
        List<YAccompany> list = yAccompanyService.selectYAccompanyList(yAccompany);
        return getDataTable(list);
    }

    /**
     * 导出陪护信息登记列表
     */
    @RequiresPermissions("hospital:accompany:export")
    @Log(title = "陪护信息登记", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(YAccompany yAccompany)
    {
        List<YAccompany> list = yAccompanyService.selectYAccompanyList(yAccompany);
        ExcelUtil<YAccompany> util = new ExcelUtil<YAccompany>(YAccompany.class);
        return util.exportExcel(list, "accompany");
    }

    /**
     * 新增陪护信息登记
     */
    @GetMapping("/add/{pid}")
    public String add(@PathVariable("pid") String pid, ModelMap mmap)
    {
        mmap.put("pid", pid);
        return prefix + "/add";
    }

    /**
     * 新增保存陪护信息登记
     */
    @RequiresPermissions("hospital:accompany:add")
    @Log(title = "陪护信息登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(YAccompany yAccompany,YPatient yPatient)
    {
        int num = yAccompanyService.insertYAccompany(yAccompany);
        long a =  yAccompany.getAid();
        yPatient.setPid(null);
        yPatient.setAid(a);
        yPatientService.insertYPatient(yPatient);
        return toAjax(num);
    }

    /**
     * 修改陪护信息登记
     */
    @GetMapping("/edit/{aid}")
    public String edit(@PathVariable("aid") Long aid, ModelMap mmap)
    {
        YAccompany yAccompany = yAccompanyService.selectYAccompanyById(aid);
        mmap.put("yAccompany", yAccompany);
        return prefix + "/edit";
    }

    /**
     * 修改保存陪护信息登记
     */
    @RequiresPermissions("hospital:accompany:edit")
    @Log(title = "陪护信息登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(YAccompany yAccompany,YPatient yPatient)
    {
        yPatientService.updateYPatient(yPatient);
        return toAjax(yAccompanyService.updateYAccompany(yAccompany));
    }

    /**
     * 删除陪护信息登记
     */
    @RequiresPermissions("hospital:accompany:remove")
    @Log(title = "陪护信息登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(yAccompanyService.deleteYAccompanyByIds(ids));
    }
}
