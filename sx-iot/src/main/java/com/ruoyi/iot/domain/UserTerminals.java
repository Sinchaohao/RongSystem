package com.ruoyi.iot.domain;

import javax.persistence.Column;
import java.util.Date;

/**
 * @开发人员: 申超豪
 * @开发单位：湖南农业大学物联网工程专业
 * @Description:
 * @Date:
 */
public class UserTerminals {
    private int id;
    private String userid;
    private String teid;
    private String comstand;
    private String note;
    private String broadtel;
    private String broadfre;
    private String intertime;
    private String creatime;
    private boolean isuse;
    private Date lasttime;
    private int day;
    private String rds;
    private String fmfrequency;
    private float trafficlimit;
    private String warn;

    public String getWarn() {
        return warn;
    }

    public void setWarn(String warn) {
        this.warn = warn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTeid() {
        return teid;
    }

    public void setTeid(String teid) {
        this.teid = teid;
    }

    public String getComstand() {
        return comstand;
    }

    public void setComstand(String comstand) {
        this.comstand = comstand;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getBroadtel() {
        return broadtel;
    }

    public void setBroadtel(String broadtel) {
        this.broadtel = broadtel;
    }

    public String getBroadfre() {
        return broadfre;
    }

    public void setBroadfre(String broadfre) {
        this.broadfre = broadfre;
    }

    public String getIntertime() {
        return intertime;
    }

    public void setIntertime(String intertime) {
        this.intertime = intertime;
    }

    public String getCreatime() {
        return creatime;
    }

    public void setCreatime(String creatime) {
        this.creatime = creatime;
    }

    public boolean isIsuse() {
        return isuse;
    }

    public void setIsuse(boolean isuse) {
        this.isuse = isuse;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getRds() {
        return rds;
    }

    public void setRds(String rds) {
        this.rds = rds;
    }

    public String getFmfrequency() {
        return fmfrequency;
    }

    public void setFmfrequency(String fmfrequency) {
        this.fmfrequency = fmfrequency;
    }

    public float getTrafficlimit() {
        return trafficlimit;
    }

    public void setTrafficlimit(float trafficlimit) {
        this.trafficlimit = trafficlimit;
    }

//    Date date = new Date();
//    SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
//    String time = sc.next();
//        try {
//        Date d = sdf.parse(time); // 将日期和时间的字符串表示形式转换为其等效的 DateTime。
//        // date.getTime() 返回时间的毫秒数值
//        int year = (int) ((date.getTime() - d.getTime()) / (1000 * 60 * 60 * 24)) / 365; // 计算年
//        int day = (int) ((date.getTime() - d.getTime()) / (1000 * 60 * 60 * 24)); // 计算天
//        System.out.println("您距今已生活了" + year + "年，" + "总共" + day + "天。");
//
//    } catch (ParseException e) {
//        e.
//    }
}
