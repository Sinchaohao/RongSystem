package com.ruoyi.iot.domain;

/**
 * @开发人员: 申超豪
 * @开发单位：湖南农业大学物联网工程专业
 * @Description:
 * @Date:
 */
public class AreaData {
    private int id;
    private int type;
    private String rid;
    private String rname;
    private String riverdata;
    private String tempdata;
    private String raindata;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

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

    public String getRiverdata() {
        return riverdata;
    }

    public void setRiverdata(String riverdata) {
        this.riverdata = riverdata;
    }

    public String getTempdata() {
        return tempdata;
    }

    public void setTempdata(String tempdata) {
        this.tempdata = tempdata;
    }

    public String getRaindata() {
        return raindata;
    }

    public void setRaindata(String raindata) {
        this.raindata = raindata;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
