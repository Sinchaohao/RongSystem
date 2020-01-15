package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.SecArea;

import java.util.List;
import java.util.Map;

/**
 * 终端地域 服务层
 * 
 * @author 张超
 * @date 2019-01-17
 */
public interface ISecAreaService
{
	/**
     * 查询终端地域信息
     * 
     * @param aid 终端地域ID
     * @return 终端地域信息
     */
	public SecArea selectAreaById(String aid);

	/**
	 * 查询终端地区树
	 *
	 * @param secArea 部门信息
	 * @return 所有部门信息
	 */
	public List<Map<String, Object>> selectAreaTree(SecArea secArea);


	/**
     * 查询终端地域列表
     * 
     * @param secArea 终端地域信息
     * @return 终端地域集合
     */
	public List<SecArea> selectAreaList(SecArea secArea);

	/**
	 * 通过aid查询终端地域列表
	 *
	 * @param secArea 终端地域信息
	 * @return 终端地域集合
	 */
	public List<SecArea> chooseAreaList(SecArea secArea);
	/**
     * 新增终端地域chooseAreaList
     * 
     * @param secArea 终端地域信息
     * @return 结果
     */
	public int insertArea(SecArea secArea);
	
	/**
     * 修改终端地域
     * 
     * @param secArea 终端地域信息
     * @return 结果
     */
	public int updateArea(SecArea secArea);
		
	/**
     * 删除终端地域信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteAreaByIds(String ids);


	/**
	 * 树
	 * @return 终端地域信息
	 */
	public SecArea selectAllArea();
}
