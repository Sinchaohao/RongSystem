package com.ruoyi.iot.mapper;

import com.ruoyi.common.utils.PageData;
import com.ruoyi.iot.domain.IotgetPa;
import com.ruoyi.iot.domain.Security;
import com.ruoyi.iot.domain.Torrent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 终端运转 数据层
 * 
 * @author 张超
 * @date 2019-03-03
 */
@Mapper
public interface SecMapper
{
    /**
     * 获取所有安防信息
     *
     * @return 结果
     */
    public List<Security> selectSecList();
}