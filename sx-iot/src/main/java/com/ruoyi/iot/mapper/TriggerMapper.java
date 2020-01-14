package com.ruoyi.iot.mapper;

import com.ruoyi.iot.domain.Trigger;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TriggerMapper {
    public List<Trigger> selectlist();
}
