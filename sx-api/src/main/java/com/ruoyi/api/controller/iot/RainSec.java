package com.ruoyi.api.controller.iot;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/27 16:03
 * @开发版本：综合练习V0.1
 */

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.service.IRainSecService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/security")
@CrossOrigin
@Api(value = "降雨量警报")
public class RainSec {

    @Autowired
    private IRainSecService rainSecService;

    @CrossOrigin
    @GetMapping("/rain")
    @ApiOperation(value = "降雨量警报")

    public RongApiRes selectList(){
        List pre = rainSecService.selectRaintSecList();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }

}
