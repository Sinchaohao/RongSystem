package com.ruoyi.web.controller.iot;

import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.framework.web.base.BaseController;
import com.ruoyi.iot.domain.AreaData;
import com.ruoyi.iot.domain.UserTerminals;
import com.ruoyi.iot.service.IAreaDataService;
import com.ruoyi.iot.service.IMilService;
import com.ruoyi.iot.service.IUserTerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/iot/milpannel")
public class milpannelController extends BaseController {
    private String prefix ="iot/milpannel";

    @GetMapping()
    public String milpannel() {
        return prefix + "/bMilpannel";
    }
}
