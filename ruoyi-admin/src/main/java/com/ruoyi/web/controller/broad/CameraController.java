package com.ruoyi.web.controller.broad;

import com.ruoyi.framework.web.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program:控制台-摄像头数据的开发
 * @开发人员：彭茂麒
 * @开发单位：湖南农业大学物联网工程专业
 * @Data:
 */

@Controller
@RequestMapping("/broad/camera")
public class CameraController extends BaseController {
    private String prefix = "broad/camera";


    @GetMapping()
    public String pannel() {
        return prefix + "/cameraPannel";
    }
}