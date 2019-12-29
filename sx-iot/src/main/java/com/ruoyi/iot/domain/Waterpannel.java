package com.ruoyi.iot.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.base.BaseEntity;
import java.util.Date;

/**
 * 终端运转表 torrent
 *
 * @author 张超
 * @date 2019-03-03
 */

  public class  Waterpannel extends BaseEntity {

    private static final long serialVersionUID = 1L;


    private Integer id;

    private String aid;

    private String tem;

    private String ph;

    private String N_data;

    private String P_data;

    private String Q_data;

    private String S_data;

    private String Fu_data;

    private String Bac_data;

    private String sampling_by;

    private Date sampling_time;

    private String remark;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getN_data() {
        return N_data;
    }

    public void setN_data(String n_data) {
        N_data = n_data;
    }

    public String getP_data() {
        return P_data;
    }

    public void setP_data(String p_data) {
        P_data = p_data;
    }

    public String getQ_data() {
        return Q_data;
    }

    public void setQ_data(String q_data) {
        Q_data = q_data;
    }

    public String getS_data() {
        return S_data;
    }

    public void setS_data(String s_data) {
        S_data = s_data;
    }

    public String getFu_data() {
        return Fu_data;
    }

    public void setFu_data(String fu_data) {
        Fu_data = fu_data;
    }

    public String getBac_data() {
        return Bac_data;
    }

    public void setBac_data(String bac_data) {
        Bac_data = bac_data;
    }

    public String getSampling_by() {
        return sampling_by;
    }

    public void setSampling_by(String sampling_by) {
        this.sampling_by = sampling_by;
    }

    public Date getSampling_time() {
        return sampling_time;
    }

    public void setSampling_time(Date sampling_time) {
        this.sampling_time = sampling_time;
    }

    @Override
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Waterpannel{" +
                "id=" + id +
                ", aid='" + aid + '\'' +
                ", tem='" + tem + '\'' +
                ", ph='" + ph + '\'' +
                ", N_data='" + N_data + '\'' +
                ", P_data='" + P_data + '\'' +
                ", Q_data='" + Q_data + '\'' +
                ", S_data='" + S_data + '\'' +
                ", Fu_data='" + Fu_data + '\'' +
                ", Bac_data='" + Bac_data + '\'' +
                ", sampling_by='" + sampling_by + '\'' +
                ", sampling_time=" + sampling_time +
                ", remark='" + remark + '\'' +
                '}';
    }
}