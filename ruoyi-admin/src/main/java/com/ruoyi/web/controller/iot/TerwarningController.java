package com.ruoyi.web.controller.iot;

import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.UserTerminals;
import com.ruoyi.iot.service.IUserTerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @开发人员: 申超豪
 * @开发单位：湖南农业大学物联网工程专业
 * @Description:
 * @Date:
 */
@Controller
@RequestMapping("/iot/terwarning")
public class TerwarningController extends BaseController {
    private String prefix = "/iot/terwarning";

    @Autowired
    private IUserTerService userTerService;
    @GetMapping()
    public String terwarning(){ return prefix + "/TerWarning";}

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(){
        startPage();
        List<UserTerminals> list =userTerService.selectTerInvalid();
        return getDataTable(list);
    }

    @RequestMapping("/updatetid")
    @GetMapping()
    public String updatetid(int tid){
        userTerService.updateTid(tid);
        return  prefix + "/TerWarning";
    }

}
