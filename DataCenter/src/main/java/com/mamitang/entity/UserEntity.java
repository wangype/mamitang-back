package com.mamitang.entity;

import java.util.Date;

public class UserEntity {
    private Integer id;

    private String username;

    private String password;

    private String specialDish;

    private Integer belongProvince;

    private Integer belongCity;

    private Integer belongArea;

    private String nickname;

    private String headimg;

    private Byte isactive;

    private Date createtime;

    private Integer applyStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpecialDish() {
        return specialDish;
    }

    public void setSpecialDish(String specialDish) {
        this.specialDish = specialDish;
    }

    public Integer getBelongProvince() {
        return belongProvince;
    }

    public void setBelongProvince(Integer belongProvince) {
        this.belongProvince = belongProvince;
    }

    public Integer getBelongCity() {
        return belongCity;
    }

    public void setBelongCity(Integer belongCity) {
        this.belongCity = belongCity;
    }

    public Integer getBelongArea() {
        return belongArea;
    }

    public void setBelongArea(Integer belongArea) {
        this.belongArea = belongArea;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public Byte getIsactive() {
        return isactive;
    }

    public void setIsactive(Byte isactive) {
        this.isactive = isactive;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }
}