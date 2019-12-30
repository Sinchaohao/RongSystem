package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.AreaData;
import com.ruoyi.iot.domain.RiverData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @开发人员: 申超豪
 * @开发单位：湖南农业大学物联网工程专业
 * @Description:
 * @Date:
 */
@Mapper
public interface AreaDataMapper {
    public List<AreaData> selectDataByRname(String rname);

}
