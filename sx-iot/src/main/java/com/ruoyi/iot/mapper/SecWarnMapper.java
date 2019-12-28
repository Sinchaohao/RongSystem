package com.ruoyi.iot.mapper;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/26 17:24
 * @开发版本：综合练习V0.1
 */

import com.ruoyi.iot.domain.Secwarn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SecWarnMapper {

    /**
     * 获取所有降雨安防警报信息
     *
     * @return 结果
     */
    public List<Secwarn> selectRainSecList();

    /**
     * 获取所有空气质量安防警报信息
     *
     * @return 结果
     */
    public List<Secwarn> selectPmSecList();
}
