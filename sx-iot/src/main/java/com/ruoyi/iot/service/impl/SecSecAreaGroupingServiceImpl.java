package com.ruoyi.iot.service.impl;

import com.ruoyi.iot.domain.SecAreaGrouping;
import com.ruoyi.iot.mapper.SecAreaGroupingMapper;
import com.ruoyi.iot.service.ISecAreaGroupingService;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2019/8/2.
 * @author cx
 * 分组管理实现
 */
@Service
public class SecSecAreaGroupingServiceImpl implements ISecAreaGroupingService {
    /**
   * 查询分组列表，连表查询
   *
   * @return 终端分组列表
   */
    @Autowired
    private SecAreaGroupingMapper secAreaGroupingMapper;

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<SecAreaGrouping> listAreaGrouping(SecAreaGrouping secAreaGrouping)
    {
        return secAreaGroupingMapper.listAreaGrouping(secAreaGrouping);
    }

    /**
    * 更新分组列表
    *
    * @return 终端分组列表
    */
    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public int updateAreaGrouping(SecAreaGrouping secAreaGrouping)
    {
        return secAreaGroupingMapper.updateAreaGrouping(secAreaGrouping);
    }
    /**
    * 插入分组列表
    *
    * @return 终端分组列表
    */
    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public int insertAreaGrouping(SecAreaGrouping secAreaGrouping)
    {
        return secAreaGroupingMapper.insertAreaGrouping(secAreaGrouping);
    }
    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public int deleteAreaGroupingByIds(String ids)
    {
        return secAreaGroupingMapper.deleteAreaGroupingByIds(Convert.toStrArray(ids));
    }

    /**
     * 插入分组列表
     *
     * @return 终端分组列表
     */
    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public SecAreaGrouping selectAreaGroupingByAid(String aid)
    {
        return secAreaGroupingMapper.selectAreaGroupingByAid(aid);
    }
}
