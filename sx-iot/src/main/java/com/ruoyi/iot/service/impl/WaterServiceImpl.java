package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Watertem;
import com.ruoyi.iot.mapper.WatertemMapper;
import com.ruoyi.iot.service.IWatertemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class WaterServiceImpl implements IWatertemService {

    @Autowired
    private WatertemMapper watertemMapper;
    @DataSource(value = DataSourceType.SXIOT)
    public List<Watertem> selecttem()
    {
        return watertemMapper.selecttem();
    }
}
