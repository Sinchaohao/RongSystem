package com.ruoyi.web.controller.iot;

import com.ruoyi.framework.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/iot/waterpannel")
public class WaterpannelController extends BaseController {
    private String prefix= "iot/waterpannel";

    @GetMapping()
    public String water()
    {
        return prefix + "/waterpannel";
    }

}
