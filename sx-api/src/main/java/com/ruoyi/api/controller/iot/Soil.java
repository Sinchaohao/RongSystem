package com.ruoyi.api.controller.iot;

import com.ruoyi.api.domain.RongApiRes;
import com.ruoyi.api.service.RongApiService;
import com.ruoyi.iot.domain.IotgetPa;
import com.ruoyi.iot.service.impl.SoilWaterServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/iot")
@CrossOrigin
public class Soil {
 @Autowired
 private SoilWaterServiceImpl soilWaterService;
    @CrossOrigin
    @GetMapping("/water")
    @ApiOperation(value = "根据时间统各阶段土壤含水量")
    public RongApiRes selectwaterList(){
        List pre = soilWaterService.select();
        RongApiRes test = RongApiService.get_list(pre);
        return test;    }
}
