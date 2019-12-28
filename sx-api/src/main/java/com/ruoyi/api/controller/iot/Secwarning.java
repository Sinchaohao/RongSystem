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
import com.ruoyi.iot.service.ISecWarnService;
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
@Api(value = "各类警报可视化")
public class Secwarning {

    @Autowired
    private ISecWarnService secWarnService;

    @CrossOrigin
    @GetMapping("/rain")
    @ApiOperation(value = "降雨量警报可视化")
    public RongApiRes selectRainList(){
        List pre = secWarnService.selectRainSecList();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }

    @GetMapping("/pm")
    @ApiOperation(value = "空气质量警报可视化")

    public RongApiRes selectPmList(){
        List pre = secWarnService.selectPmSecList();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }

    @GetMapping("/temp")
    @ApiOperation(value = "温度警报可视化")

    public RongApiRes selectTempList(){
        List pre = secWarnService.selectTempSecList();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }

    @GetMapping("/wlevel")
    @ApiOperation(value = "水位警报可视化")

    public RongApiRes selectWlvlList(){
        List pre = secWarnService.selectWlvlSecList();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }

    @GetMapping("/hum")
    @ApiOperation(value = "湿度警报可视化")

    public RongApiRes selectHumList(){
        List pre = secWarnService.selectHumSecList();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }

    @GetMapping("/sectype")
    @ApiOperation(value = "警报类型可视化")

    public RongApiRes selectTypeList(){
        List pre = secWarnService.selectTypeSecList();
        RongApiRes test = RongApiService.get_list(pre);
        return test;
    }
}
