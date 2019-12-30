package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.UserTerminals;
import com.ruoyi.iot.mapper.UserTerMapper;
import com.ruoyi.iot.service.IUserTerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @开发人员: 申超豪
 * @开发单位：湖南农业大学物联网工程专业
 * @Description:
 * @Date:
 */
@Service
public class UserTerServiceImpl implements IUserTerService {
    @Autowired
    private UserTerMapper userTerMapper;

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<UserTerminals> selectTerInvalid(){
        List<UserTerminals> res=userTerMapper.selectTerInvalid();
        for(UserTerminals userTerminals:res){
            if(userTerminals.getDay()<=7&&userTerminals.getDay()>=0)userTerminals.setWarn("2");
            else if(userTerminals.getDay()>7&&userTerminals.getDay()<=15)userTerminals.setWarn("1");
            else if(userTerminals.getDay()>15&&userTerminals.getDay()<=31)userTerminals.setWarn("0");
            else if(userTerminals.getDay()>31&&userTerminals.getDay()<=1460)userTerminals.setWarn("SSS");
            else userTerminals.setWarn("终端超寿命需要更换");
        }
        return res;
    }
}
