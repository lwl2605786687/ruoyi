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
import com.ruoyi.hospital.domain.YNucleate;
import com.ruoyi.hospital.service.IYNucleateService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 核酸检测登记Controller
 * 
 * @author lwl
 * @date 2020-06-28
 */
@Controller
@RequestMapping("/hospital/nucleate")
public class YNucleateController extends BaseController
{
    private String prefix = "hospital/nucleate";

    @Autowired
    private IYNucleateService yNucleateService;

    @Autowired
    private IYPatientService yPatientService;

    @RequiresPermissions("hospital:nucleate:view")
    @GetMapping()
    public String nucleate()
    {
        return prefix + "/nucleate";
    }

    /**
     * 查询核酸检测登记列表
     */
    @RequiresPermissions("hospital:nucleate:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(YNucleate yNucleate)
    {
        startPage();
        List<YNucleate> list = yNucleateService.selectYNucleateList(yNucleate);
        return getDataTable(list);
    }

    /**
     * 导出核酸检测登记列表
     */
    @RequiresPermissions("hospital:nucleate:export")
    @Log(title = "核酸检测登记", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(YNucleate yNucleate)
    {
        List<YNucleate> list = yNucleateService.selectYNucleateList(yNucleate);
        ExcelUtil<YNucleate> util = new ExcelUtil<YNucleate>(YNucleate.class);
        return util.exportExcel(list, "nucleate");
    }

    /**
     * 新增核酸检测登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存核酸检测登记
     */
    @RequiresPermissions("hospital:nucleate:add")
    @Log(title = "核酸检测登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(YNucleate yNucleate, YPatient yPatient)
    {
        int num = yNucleateService.insertYNucleate(yNucleate);
        long n = yNucleate.getNid();
        yPatient.setNid(n);
        yPatientService.insertYPatient(yPatient);
        return toAjax(num);
    }

    /**
     * 修改核酸检测登记
     */
    @GetMapping("/edit/{nid}")
    public String edit(@PathVariable("nid") Long nid, ModelMap mmap)
    {
        YNucleate yNucleate = yNucleateService.selectYNucleateById(nid);
        mmap.put("yNucleate", yNucleate);
        return prefix + "/edit";
    }

    /**
     * 修改保存核酸检测登记
     */
    @RequiresPermissions("hospital:nucleate:edit")
    @Log(title = "核酸检测登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(YNucleate yNucleate,YPatient yPatient)
    {
        yPatientService.updateYPatient(yPatient);
        return toAjax(yNucleateService.updateYNucleate(yNucleate));
    }

    /**
     * 删除核酸检测登记
     */
    @RequiresPermissions("hospital:nucleate:remove")
    @Log(title = "核酸检测登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(yNucleateService.deleteYNucleateByIds(ids));
    }
}
