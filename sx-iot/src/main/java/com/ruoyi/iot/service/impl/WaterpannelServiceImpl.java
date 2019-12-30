 package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Waterpannel;

import com.ruoyi.iot.mapper.WaterpannelMapper;
import com.ruoyi.iot.service.IWaterpannelService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
public class  WaterpannelServiceImpl implements IWaterpannelService{

    @Autowired
    private WaterpannelMapper waterpannelMapper;

        /**
         * 查询所有水质数据

         * @param
         * @return
         */
        @Override
        @DataSource(value = DataSourceType.SXIOT)
        public List<Waterpannel> selectWaterpannelList(){
            return waterpannelMapper.selectWaterpannelList();
        }

    /**
     * 查询水质数据信息
     *
     * @param id 水质数据ID
     * @return 水质数据信息
     */

    @DataSource(value = DataSourceType.SXIOT)
      public List<Map<String,Object>> selectListById(Integer id)
    {
        return waterpannelMapper.selectListById(id);
    }





    /**
     * 删除水质数据信息
     *
     * @param id 水质数据信息
     * @return 结果
     */

    @DataSource(value = DataSourceType.SXIOT)
    public List<Map<String,Object>> deleteListById(Integer id)
    {
        return waterpannelMapper.deleteListById(id);
    }




//    /**
//     * 修改水质监测
//     *
//     * @param waterpannel 水质监测信息
//     * @return 结果
//     */

//    @DataSource(value = DataSourceType.SXIOT)
//    public int updateWaterpannel(Waterpannel waterpannel)
//    {
//        return waterpannelMapper.updateWaterpannel(waterpannel);
//    }

    /**
     * 查询水质监测列表
     *
     * @param waterpannel 水质监测信息
     * @return 水质监测集合
     */

//    @DataSource(value = DataSourceType.SXIOT)
//    public List<Waterpannel> selectWaterpannelList(Waterpannel waterpannel)
//    {
//        return waterpannelMapper.selectWaterpannelList(waterpannel);
//    }

}
