package com.ruoyi.web.controller.iot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/iot/metpannel")
public class metpannelController {
    private String prefix="metpannel";

    @GetMapping()
    public String metpannel(){
        return prefix + "metpannel";
    }
}
