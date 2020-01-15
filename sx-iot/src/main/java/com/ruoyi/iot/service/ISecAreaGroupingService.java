package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.SecAreaGrouping;

import java.util.List;

/**
 * Created by ASUS on 2019/8/2.
 * @author 陈霞
 */
public interface ISecAreaGroupingService {
  /**
   * 查询分组列表，连表查询
   *
   * @return 终端分组列表
   */
    public List<SecAreaGrouping> listAreaGrouping(SecAreaGrouping secAreaGrouping);


    /**
     * @author cx
     * @param aid
     *
     * @Description 分组管理批量删除
     */
    public int deleteAreaGroupingByIds(String aid);

    /**
    * 更新分组列表
    *
    * @return 终端分组列表
    */
    public int updateAreaGrouping(SecAreaGrouping secAreaGrouping);

    /*
    * 插入分组列表
    *
    * @return 终端分组列表
    * */

    public int insertAreaGrouping(SecAreaGrouping secAreaGrouping);

    /*
    * 查询分组管理记录
    *
    * @return 分组管理
    * */

    public SecAreaGrouping selectAreaGroupingByAid(String aid);
}
