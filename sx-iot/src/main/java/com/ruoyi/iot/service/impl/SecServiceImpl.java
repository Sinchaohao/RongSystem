package com.ruoyi.iot.service.impl;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/20 14:27
 * @开发版本：综合练习V0.1
 */
import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.utils.PageData;
import com.ruoyi.iot.domain.Security;
import com.ruoyi.iot.mapper.SecMapper;
import com.ruoyi.iot.service.ISecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecServiceImpl implements ISecService {

    @Autowired
    private SecMapper secMapper;

    /**
     * 获取所有安防信息
     *
     * @return 结果
     */
    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Security> selectSecList(){
        return secMapper.selectSecList();
    };
}
