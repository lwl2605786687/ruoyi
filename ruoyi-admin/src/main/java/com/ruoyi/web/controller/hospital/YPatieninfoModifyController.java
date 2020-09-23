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
import com.ruoyi.hospital.domain.YPatieninfoModify;
import com.ruoyi.hospital.service.IYPatieninfoModifyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 患者信息修改Controller
 * 
 * @author lwl
 * @date 2020-07-07
 */
@Controller
@RequestMapping("/hospital/patientinfo_modify")
public class YPatieninfoModifyController extends BaseController
{
    private String prefix = "hospital/patientinfo_modify";

    @Autowired
    private IYPatieninfoModifyService yPatieninfoModifyService;

    @RequiresPermissions("hospital:patientinfo_modify:view")
    @GetMapping()
    public String patientinfo_modify()
    {
        return prefix + "/patientinfo_modify";
    }

    /**
     * 查询患者信息修改列表
     */
    @RequiresPermissions("hospital:patientinfo_modify:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(YPatieninfoModify yPatieninfoModify)
    {
        startPage();
        List<YPatieninfoModify> list = yPatieninfoModifyService.selectYPatieninfoModifyList(yPatieninfoModify);
        return getDataTable(list);
    }

    /**
     * 导出患者信息修改列表
     */
    @RequiresPermissions("hospital:patientinfo_modify:export")
    @Log(title = "患者信息修改", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(YPatieninfoModify yPatieninfoModify)
    {
        List<YPatieninfoModify> list = yPatieninfoModifyService.selectYPatieninfoModifyList(yPatieninfoModify);
        ExcelUtil<YPatieninfoModify> util = new ExcelUtil<YPatieninfoModify>(YPatieninfoModify.class);
        return util.exportExcel(list, "patientinfo_modify");
    }

    /**
     * 新增患者信息修改
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存患者信息修改
     */
    @RequiresPermissions("hospital:patientinfo_modify:add")
    @Log(title = "患者信息修改", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(YPatieninfoModify yPatieninfoModify)
    {
        return toAjax(yPatieninfoModifyService.insertYPatieninfoModify(yPatieninfoModify));
    }

    /**
     * 修改患者信息修改
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        YPatieninfoModify yPatieninfoModify = yPatieninfoModifyService.selectYPatieninfoModifyById(id);
        mmap.put("yPatieninfoModify", yPatieninfoModify);
        return prefix + "/edit";
    }

    /**
     * 修改保存患者信息修改
     */
    @RequiresPermissions("hospital:patientinfo_modify:edit")
    @Log(title = "患者信息修改", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(YPatieninfoModify yPatieninfoModify)
    {
        return toAjax(yPatieninfoModifyService.updateYPatieninfoModify(yPatieninfoModify));
    }

    /**
     * 删除患者信息修改
     */
    @RequiresPermissions("hospital:patientinfo_modify:remove")
    @Log(title = "患者信息修改", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(yPatieninfoModifyService.deleteYPatieninfoModifyByIds(ids));
    }
}
