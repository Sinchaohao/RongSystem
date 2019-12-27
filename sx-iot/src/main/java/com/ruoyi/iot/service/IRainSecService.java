package com.ruoyi.iot.service;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/26 17:23
 * @开发版本：综合练习V0.1
 */

import com.ruoyi.iot.domain.RainSecurity;

import java.util.List;

public interface IRainSecService {

    /**
     * 查询降雨安防警报
     *
     * @param
     * @return 降雨安防警报
     */
    public List<RainSecurity> selectRaintSecList();
}
