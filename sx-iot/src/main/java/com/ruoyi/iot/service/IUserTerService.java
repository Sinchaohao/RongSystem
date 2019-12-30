package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.UserTerminals;

import java.util.List;

/**
 * @开发人员: 申超豪
 * @开发单位：湖南农业大学物联网工程专业
 * @Description:
 * @Date:
 */
public interface IUserTerService {
    public List<UserTerminals> selectTerInvalid();
}
