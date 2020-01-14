package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.SoilWater;
import com.ruoyi.iot.mapper.SoilWaterMapper;
import com.ruoyi.iot.service.SoilWaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class SoilWaterServiceImpl  implements SoilWaterService {
    @Autowired
    private SoilWaterMapper soilWaterMapper;

    @Override
    @DataSource(value = DataSourceType.SXSOIL)
    public List<SoilWater>select(){
        return soilWaterMapper.select();
    }
    @Override
    @DataSource(value = DataSourceType.SXSOIL)
    public List<SoilWater>selectname(){
        return  soilWaterMapper.selectname();
    }

}
