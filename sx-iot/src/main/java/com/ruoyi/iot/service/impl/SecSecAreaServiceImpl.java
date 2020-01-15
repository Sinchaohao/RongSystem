package com.ruoyi.iot.service.impl;

import com.ruoyi.iot.domain.SecArea;
import com.ruoyi.iot.mapper.SecAreaMapper;
import com.ruoyi.iot.service.ISecAreaService;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 终端地域 服务层实现
 *
 * @author 张超
 * @date 2019-01-17
 */
@Service
public class SecSecAreaServiceImpl implements ISecAreaService
{
	@Autowired
	private SecAreaMapper secAreaMapper;

	/**
     * 查询终端地域信息
     *
     * @param aid 终端地域ID
     * @return 终端地域信息
     */
    @Override
	@DataSource(value = DataSourceType.SXIOT)
	public SecArea selectAreaById(String aid)
	{
	    return secAreaMapper.selectAreaById(aid);
	}

	/**
	    * 查询终端地区树
	    * @author 张超 teavamc
	    * @date 2019/2/14
	    * @param
	    * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
	    */
	@Override
	@DataSource(value = DataSourceType.SXIOT)
	public List<Map<String, Object>> selectAreaTree(SecArea secArea){
		List<Map<String, Object>> trees = new ArrayList<Map<String, Object>>();
		List<SecArea> secAreaList = secAreaMapper.chooseAreaList(secArea);
		trees = getTrees(secAreaList);
		return trees;
	}


	/**
	    * 根据List生产tree，前提是模型中包含id和父id关系
	    * @author 张超 teavamc
	    * @date 2019/2/14
	    * @param
	    * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
	    */
	public List<Map<String, Object>> getTrees(List<SecArea> secAreaList)
	{

		List<Map<String, Object>> trees = new ArrayList<Map<String, Object>>();
		for (SecArea secArea : secAreaList)
		{
			Map<String, Object> areaMap = new HashMap<String, Object>();
			areaMap.put("id", secArea.getAid());
			areaMap.put("pId", secArea.getParentaid());
			areaMap.put("name", secArea.getAname());
			areaMap.put("title", secArea.getAname());
			trees.add(areaMap);
		}
		return trees;
	}

	/**
     * 查询终端地域列表
     *
     * @param secArea 终端地域信息
     * @return 终端地域集合
     */
	@Override
	@DataSource(value = DataSourceType.SXIOT)
	public List<SecArea> selectAreaList(SecArea secArea)
	{
	    return secAreaMapper.selectAreaList(secArea);
	}

	@Override
	@DataSource(value = DataSourceType.SXIOT)
	public List<SecArea> chooseAreaList(SecArea secArea) {
		return secAreaMapper.chooseAreaList(secArea);
	}

	/**
     * 新增终端地域
     *
     * @param secArea 终端地域信息
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXIOT)
	public int insertArea(SecArea secArea)
	{
	    return secAreaMapper.insertArea(secArea);
	}

	/**
     * 修改终端地域
     *
     * @param secArea 终端地域信息
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXIOT)
	public int updateArea(SecArea secArea)
	{
	    return secAreaMapper.updateArea(secArea);
	}

	/**
     * 删除终端地域对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	@DataSource(value = DataSourceType.SXIOT)
	public int deleteAreaByIds(String ids)
	{
		return secAreaMapper.deleteAreaByIds(Convert.toStrArray(ids));
	}

	/**
	 * 树
	 *
	 */
	@Override
	@DataSource(value = DataSourceType.SXIOT)
	public SecArea selectAllArea(){return secAreaMapper.selectAllArea();}
}
