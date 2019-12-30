package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Tersga1;
import com.ruoyi.iot.mapper.Soil3DMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class Soil3DServiceImpl {
    @Autowired
    private Soil3DMapper soil3D;

    @DataSource(value = DataSourceType.SXSOIL)
    public Tersga1 sumters(){
        return soil3D.sumters();
    }

    @DataSource(value = DataSourceType.SXSOIL)
    public List<Tersga1> sumterm(){
        return soil3D.sumterm();
    }
}
