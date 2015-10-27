package com.mamitang.model;

import java.util.Date;
import java.util.Map;

/**
 * model to show advertisement detail in the front
 * Created by lyy on 10/21/15.
 */
public class AdvertisementDetail {
    private String name;
    private Date publishtime;
    private Byte isenable;
    private Map<String , String> imgs;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getPublishtime() {
        return publishtime;
    }
    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }
    public Byte getIsenable() {
        return isenable;
    }
    public void setIsenable(Byte isenable) {
        this.isenable = isenable;
    }
    public Map<String, String> getImgs() {
        return imgs;
    }
    public void setImgs(Map<String, String> imgs) {
        this.imgs = imgs;
    }
}
