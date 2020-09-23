package com.ruoyi.web.controller.hospital;

import java.util.List;
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
import com.ruoyi.hospital.domain.YPatient;
import com.ruoyi.hospital.service.IYPatientService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 病人信息Controller
 * 
 * @author lwl
 * @date 2020-06-28
 */
@Controller
@RequestMapping("/hospital/patient")
public class YPatientController extends BaseController
{
    private String prefix = "hospital/patient";

    @Autowired
    private IYPatientService yPatientService;

    @RequiresPermissions("hospital:patient:view")
    @GetMapping()
    public String patient()
    {
        return prefix + "/patient";
    }

    /**
     * 查询病人信息列表
     */
    @RequiresPermissions("hospital:patient:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(YPatient yPatient)
    {
        startPage();
        List<YPatient> list = yPatientService.selectYPatientList(yPatient);
        return getDataTable(list);
    }

    /**
     * 导出病人信息列表
     */
    @RequiresPermissions("hospital:patient:export")
    @Log(title = "病人信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(YPatient yPatient)
    {
        List<YPatient> list = yPatientService.selectYPatientList(yPatient);
        ExcelUtil<YPatient> util = new ExcelUtil<YPatient>(YPatient.class);
        return util.exportExcel(list, "patient");
    }

    /**
     * 新增病人信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存病人信息
     */
    @RequiresPermissions("hospital:patient:add")
    @Log(title = "病人信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(YPatient yPatient)
    {
        return toAjax(yPatientService.insertYPatient(yPatient));
    }

    /**
     * 修改病人信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        YPatient yPatient = yPatientService.selectYPatientById(id);
        mmap.put("yPatient", yPatient);
        return prefix + "/edit";
    }

    /**
     * 修改保存病人信息
     */
    @RequiresPermissions("hospital:patient:edit")
    @Log(title = "病人信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(YPatient yPatient)
    {
        return toAjax(yPatientService.updateYPatient(yPatient));
    }

    /**
     * 删除病人信息
     */
    @RequiresPermissions("hospital:patient:remove")
    @Log(title = "病人信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(yPatientService.deleteYPatientByIds(ids));
    }

}
