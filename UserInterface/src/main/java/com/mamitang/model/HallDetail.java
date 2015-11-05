package com.mamitang.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lyy on 11/2/15.
 */
public class HallDetail {
    private String hallName;
    private Integer hallSupplyType;
    private String roll;
    private String hallPhone;
    private BigDecimal hallPraiseNum;
    private BigDecimal hallCollectionNum;
    private String hallAddress;
    private Date hallCreateDate;
    private String hallCoverUrl;

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public Integer getHallSupplyType() {
        return hallSupplyType;
    }

    public void setHallSupplyType(Integer hallSupplyType) {
        this.hallSupplyType = hallSupplyType;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getHallPhone() {
        return hallPhone;
    }

    public void setHallPhone(String hallPhone) {
        this.hallPhone = hallPhone;
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

    public String getHallAddress() {
        return hallAddress;
    }

    public void setHallAddress(String hallAddress) {
        this.hallAddress = hallAddress;
    }

    public Date getHallCreateDate() {
        return hallCreateDate;
    }

    public void setHallCreateDate(Date hallCreateDate) {
        this.hallCreateDate = hallCreateDate;
    }

    public String getHallCoverUrl() {
        return hallCoverUrl;
    }

    public void setHallCoverUrl(String hallCoverUrl) {
        this.hallCoverUrl = hallCoverUrl;
    }
}
