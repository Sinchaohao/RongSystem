package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.RiverData;
import com.ruoyi.iot.mapper.RiverDataMapper;
import com.ruoyi.iot.service.IAreaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @开发人员: 申超豪
 * @开发单位：湖南农业大学物联网工程专业
 * @Description:
 * @Date:
 */
@Service
public class AreaDataServiceImpl implements IAreaDataService {
    @Autowired
    private RiverDataMapper riverDataMapper;

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<RiverData> selectData(){
        return riverDataMapper.selectData();
    }
}
