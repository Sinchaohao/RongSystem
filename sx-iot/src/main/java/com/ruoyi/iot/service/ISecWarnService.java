package com.ruoyi.iot.service;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/26 17:23
 * @开发版本：综合练习V0.1
 */

import com.ruoyi.iot.domain.Secwarn;

import java.util.List;

public interface ISecWarnService {

    /**
     * 查询降雨安防警报
     *
     * @param
     * @return 降雨安防警报
     */
    public List<Secwarn> selectRainSecList();

    /**
     * 查询空气质量安防警报
     *
     * @param
     * @return 空气质量安防警报
     */
    public List<Secwarn> selectPmSecList();

    /**
     * 查询温度安防警报
     *
     * @param
     * @return 温度安防警报
     */
    public List<Secwarn> selectTempSecList();
    /**
     * 查询水位安防警报
     *
     * @param
     * @return 水位安防警报
     */
    public List<Secwarn> selectWlvlSecList();

    /**
     * 查询湿度安防警报
     *
     * @param
     * @return 湿度安防警报
     */
    public List<Secwarn> selectHumSecList();

    /**
     * 查询安防警报触发信息
     *
     * @param
     * @return 安防警报触发信息
     */
    public List<Secwarn> selectTypeSecList();
}
