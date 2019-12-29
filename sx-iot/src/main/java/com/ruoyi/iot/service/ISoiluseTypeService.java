package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Soilusetype;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ISoiluseTypeService {
    public List<Soilusetype> select();
}
