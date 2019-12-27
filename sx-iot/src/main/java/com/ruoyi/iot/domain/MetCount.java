package com.ruoyi.iot.domain;

import com.ruoyi.common.base.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @开发人员：周宇滔
 * @开发单位：湖南农业大学物联网工程专业
 */

public class MetCount extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String rid;
    private String rname;
    private String rdata;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdata() {
        return rdata;
    }

    public void setRdata(String rdata) {
        this.rdata = rdata;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("rid", getRid())
                .append("rname", getRname())
                .append("rdata",getRdata())
                .toString();
    }
}
