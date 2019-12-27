package com.ruoyi.iot.domain;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/26 17:07
 * @开发版本：综合练习V0.1
 */

import com.ruoyi.common.base.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.crypto.Data;
import java.util.Date;

public class RainSecurity extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String rain;

    private String time;

    private String content;

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "RainSecurity{" +
                "rain='" + rain + '\'' +
                ", time='" + time + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
