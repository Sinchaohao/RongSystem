package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.Waterpannel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IWaterpannelService {

    /**
     * 查询所有水质数据
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
    public List<Map<String,Object>> selectListById(@Param("id")Integer id);

    /**
     * 新增水质监测
     *
     * @param waterpannel 水质监测信息
     * @return 结果
     */
    //public int insertWaterpannel(Waterpannel waterpannel);

    /**
     * 修改水质监测
     *
     * @param waterpannel 环境水质信息
     * @return 结果
     */
    //public int updateWaterpannel(Waterpannel waterpannel);

    /**
     * 查询水质监测列表
     *
     * @param waterpannel 水质监测信息
     * @return 水质监测集合
     */
    //public List<Waterpannel> selectWaterpannelList(Waterpannel waterpannel);
}
