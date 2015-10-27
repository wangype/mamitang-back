package com.mamitang.entity;

import java.util.Date;
import java.util.List;

public class AdvertisementEntity {
    private Integer id;

    private String name;

    private Date publishtime;

    private Byte isenable;

    private List<ADPictureEntity> imgs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public List<ADPictureEntity> getImgs() {
        return imgs;
    }

    public void setImgs(List<ADPictureEntity> imgs) {
        this.imgs = imgs;
    }
}