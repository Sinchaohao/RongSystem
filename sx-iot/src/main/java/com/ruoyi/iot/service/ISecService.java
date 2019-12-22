package com.ruoyi.iot.service;

import com.ruoyi.common.utils.PageData;
import com.ruoyi.iot.domain.IotgetPa;
import com.ruoyi.iot.domain.Security;
import com.ruoyi.iot.domain.Torrent;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 终端运转 服务层
 * 
 * @author 余新伟
 * @date 2020-12-20
 */
public interface ISecService
{
    /**
     * 查询安防集合
     *
     * @param
     * @return 安防集合
     */
    public List<Security> selectSecList();
}
