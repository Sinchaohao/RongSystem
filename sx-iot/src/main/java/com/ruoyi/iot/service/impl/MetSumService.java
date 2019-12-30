package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.MetSum;
import com.ruoyi.iot.mapper.MetSumMapper;
import com.ruoyi.iot.service.IMetSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @开发人员：周宇滔
 * @开发单位：湖南农业大学物联网工程专业
 */
@Service
public class MetSumService implements IMetSumService {
    @Autowired
    private MetSumMapper metSumMapper;

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<MetSum> selectRainMet(){
        return metSumMapper.selectRainMet();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<MetSum> selectHumMet(){
        return metSumMapper.selectHumMet();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<MetSum> selectSeeMet(){
        return metSumMapper.selectSeeMet();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<MetSum> selectRiverMet(){
        return metSumMapper.selectRiverMet();
    }
}
