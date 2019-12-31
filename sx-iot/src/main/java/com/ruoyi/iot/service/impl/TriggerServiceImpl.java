package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Trigger;
import com.ruoyi.iot.mapper.TriggerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TriggerServiceImpl {
    @Autowired
    private TriggerMapper triggerMapper;
    @DataSource(value = DataSourceType.SXSOIL)
    public List<Trigger> selectlist(){
        return triggerMapper.selectlist();
    }
}
