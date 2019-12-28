package com.ruoyi.iot.service.impl;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/26 17:23
 * @开发版本：综合练习V0.1
 */

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Secwarn;
import com.ruoyi.iot.mapper.SecWarnMapper;
import com.ruoyi.iot.service.ISecWarnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecWarnWarnServiceImpl implements ISecWarnService {

    @Autowired
    private SecWarnMapper secWarnMapper;

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secwarn> selectRainSecList() {
        return secWarnMapper.selectRainSecList();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secwarn> selectPmSecList() {
        return secWarnMapper.selectPmSecList();
    }
}
