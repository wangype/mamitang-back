package com.mamitang.entity;

import java.math.BigDecimal;
import java.util.Date;

public class HallEntity {
    private Integer id;

    private Integer uid;

    private String hallName;

    private String hallPhone;

    private String hallAddress;

    private String hallCoverUrl;

    private Integer hallSupplyType;

    private BigDecimal hallPraiseNum;

    private BigDecimal hallCollectionNum;

    private String hallOpenTime;

    private Integer hallState;

    private Date hallCreateDate;

    private String hallFoodStory;

    private String hallIntroduce;

    private Boolean hallIsOpenForAll;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getHallPhone() {
        return hallPhone;
    }

    public void setHallPhone(String hallPhone) {
        this.hallPhone = hallPhone;
    }

    public String getHallAddress() {
        return hallAddress;
    }

    public void setHallAddress(String hallAddress) {
        this.hallAddress = hallAddress;
    }

    public String getHallCoverUrl() {
        return hallCoverUrl;
    }

    public void setHallCoverUrl(String hallCoverUrl) {
        this.hallCoverUrl = hallCoverUrl;
    }

    public Integer getHallSupplyType() {
        return hallSupplyType;
    }

    public void setHallSupplyType(Integer hallSupplyType) {
        this.hallSupplyType = hallSupplyType;
    }

    public BigDecimal getHallPraiseNum() {
        return hallPraiseNum;
    }

    public void setHallPraiseNum(BigDecimal hallPraiseNum) {
        this.hallPraiseNum = hallPraiseNum;
    }

    public BigDecimal getHallCollectionNum() {
        return hallCollectionNum;
    }

    public void setHallCollectionNum(BigDecimal hallCollectionNum) {
        this.hallCollectionNum = hallCollectionNum;
    }

    public String getHallOpenTime() {
        return hallOpenTime;
    }

    public void setHallOpenTime(String hallOpenTime) {
        this.hallOpenTime = hallOpenTime;
    }

    public Integer getHallState() {
        return hallState;
    }

    public void setHallState(Integer hallState) {
        this.hallState = hallState;
    }

    public Date getHallCreateDate() {
        return hallCreateDate;
    }

    public void setHallCreateDate(Date hallCreateDate) {
        this.hallCreateDate = hallCreateDate;
    }

    public String getHallFoodStory() {
        return hallFoodStory;
    }

    public void setHallFoodStory(String hallFoodStory) {
        this.hallFoodStory = hallFoodStory;
    }

    public String getHallIntroduce() {
        return hallIntroduce;
    }

    public void setHallIntroduce(String hallIntroduce) {
        this.hallIntroduce = hallIntroduce;
    }

    public Boolean getHallIsOpenForAll() {
        return hallIsOpenForAll;
    }

    public void setHallIsOpenForAll(Boolean hallIsOpenForAll) {
        this.hallIsOpenForAll = hallIsOpenForAll;
    }
}