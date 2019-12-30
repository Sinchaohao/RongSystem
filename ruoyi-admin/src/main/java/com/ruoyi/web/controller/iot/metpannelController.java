package com.ruoyi.web.controller.iot;
/**
 * 周宇滔
 * 气象信息
 */


import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.MetCount;
import com.ruoyi.iot.service.IMetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.github.pagehelper.page.PageMethod.startPage;

@Controller
@RequestMapping("/iot/metpannel")
public class metpannelController extends BaseController {
    private String prefix="iot/metpannel";


    @Autowired
    private IMetService metService;


    @GetMapping()
    public String metpannel(){
        return prefix + "/metpannel";
    }



    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list()
    {
        startPage();
        List<MetCount> list = metService.selectMet();
        return getDataTable(list);
    }
}
