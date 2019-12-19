package com.ruoyi.web.controller.iot;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/19 20:38
 * @开发版本：综合练习V0.1
 */

import com.ruoyi.framework.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/iot/secpannel")
public class SecpannelController extends BaseController {
    private String prefix = "iot/secpannel";

    @GetMapping()
    public String pannel() {
        return prefix + "/bSecpannel";
    }
}
