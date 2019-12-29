package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Soilusetype;
import com.ruoyi.iot.mapper.SoilTypeMapper;
import com.ruoyi.iot.service.ISoiluseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class SoiluseServiceImpI {
    @Autowired
    private SoilTypeMapper soilTypeMapper;

    @DataSource(value = DataSourceType.SXSOIL)
    public List<Soilusetype> select()
    {
        return soilTypeMapper.select();
    }
}
