package com.ruoyi.iot.domain;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/28 18:02
 * @开发版本：综合练习V0.1
 */

import com.ruoyi.common.base.BaseEntity;

public class Secwarn extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private String pm;
    private String rain;
    private String time;

    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

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

    @Override
    public String toString() {
        return "Secwarn{" +
                "pm='" + pm + '\'' +
                ", rain='" + rain + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
