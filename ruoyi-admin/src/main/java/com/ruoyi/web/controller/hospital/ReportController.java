package com.ruoyi.web.controller.hospital;

import com.ruoyi.common.core.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LWL
 * @create 2020-09-17 17:33
 */
@Controller
@RequestMapping("/hospital/report")
public class ReportController extends BaseController {

    private String prefix = "hospital/report";

    @RequiresPermissions("hospital:report:view")
    @GetMapping()
    public String report()
    {
        return prefix + "/report";
    }
}
