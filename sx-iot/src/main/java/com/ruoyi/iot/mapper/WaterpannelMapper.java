 package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.Torrent;
import com.ruoyi.iot.domain.Waterpannel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public  interface WaterpannelMapper {

    /**
     * 查询所有水质数据记录
     *
     * @param
     *
     */
    public List<Waterpannel> selectWaterpannelList();

    /**
     * 查询水质数据信息
     *
     * @param id 水质数据ID
     * @return 水质数据信息
     */
    public  List<Map<String,Object>> selectListById(@Param("id") Integer id);

    //public int insertWaterpannel(Waterpannel waterpannel);

    //public int updateWaterpannel(Waterpannel waterpannel);

    /**
     * 查询水质监测列表
     *
     * @param waterpannel 水质监测信息
     * @return 环境监测集合
     */
    //public List<Waterpannel> selectWaterpannelList(Waterpannel waterpannel);

}
