package com.ruoyi.iot.domain;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/20 14:45
 * @开发版本：综合练习V0.1
 */

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.base.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Table;

@Repository
public class Security extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private int mid;

    private String content;//注意要和数据库中的数据类型一样

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("mid", getMid())
                .append("content", getContent())
                .toString();
    }
}
