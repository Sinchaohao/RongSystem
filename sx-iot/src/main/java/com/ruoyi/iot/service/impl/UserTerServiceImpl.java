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
            switch (userTerminals.getStatus()){
                case "1":
                    userTerminals.setStatus("上班中");
                    if(userTerminals.getDay()<7&&userTerminals.getDay()>0)userTerminals.setWarn("S");
                    else if(userTerminals.getDay()<31&&userTerminals.getDay()>=7)userTerminals.setWarn("S+");
                    else userTerminals.setWarn("S++");
                    break;
                case "2":
                    userTerminals.setStatus("休息中");
                    if(userTerminals.getDay()<7&&userTerminals.getDay()>0)userTerminals.setWarn("A");
                    else if(userTerminals.getDay()<31&&userTerminals.getDay()>=7)userTerminals.setWarn("A+");
                    else userTerminals.setWarn("A++");
                    break;
                case "3":
                    userTerminals.setStatus("请假");
                    if(userTerminals.getDay()>0&&userTerminals.getDay()<7)userTerminals.setWarn("等待工作人员");
                    else userTerminals.setWarn("安排其余在岗人员");
            }
        }
        return res;
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public int updateTid(int tid){
        return userTerMapper.updateTid(tid);
    }
}
