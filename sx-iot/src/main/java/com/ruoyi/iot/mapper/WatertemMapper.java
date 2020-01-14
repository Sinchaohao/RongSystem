package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.Watertem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WatertemMapper {

    public List<Watertem> selecttem();
}
