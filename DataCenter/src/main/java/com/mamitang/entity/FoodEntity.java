package com.mamitang.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FoodEntity {
    private Integer id;

    private Integer hid;

    private String foodPictureUrl;

    private String foodName;

    private String foodIntroduce;

    private BigDecimal foodPrice;

    private BigDecimal foodSupplyNum;

    private Date foodBeginSupplyDate;

    private Date foodEndSupplyDate;

    private String foodLabel;

    private Integer foodSupplyType;

    private String foodSupplyCycle;

    private Integer foodState;

    private Boolean foodIsHomePageShow;

    //backup field start()
    private String hallName;
    private String telephone;
    //backup field end
    public String getHallName() {
        return hallName;
    }
    public void setHallName(String hallName) {
        this.hallName = hallName;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getFoodPictureUrl() {
        return foodPictureUrl;
    }

    public void setFoodPictureUrl(String foodPictureUrl) {
        this.foodPictureUrl = foodPictureUrl;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodIntroduce() {
        return foodIntroduce;
    }

    public void setFoodIntroduce(String foodIntroduce) {
        this.foodIntroduce = foodIntroduce;
    }

    public BigDecimal getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(BigDecimal foodPrice) {
        this.foodPrice = foodPrice;
    }

    public BigDecimal getFoodSupplyNum() {
        return foodSupplyNum;
    }

    public void setFoodSupplyNum(BigDecimal foodSupplyNum) {
        this.foodSupplyNum = foodSupplyNum;
    }

    public Date getFoodBeginSupplyDate() {
        return foodBeginSupplyDate;
    }

    public void setFoodBeginSupplyDate(Date foodBeginSupplyDate) {
        this.foodBeginSupplyDate = foodBeginSupplyDate;
    }

    public Date getFoodEndSupplyDate() {
        return foodEndSupplyDate;
    }

    public void setFoodEndSupplyDate(Date foodEndSupplyDate) {
        this.foodEndSupplyDate = foodEndSupplyDate;
    }

    public String getFoodLabel() {
        return foodLabel;
    }

    public void setFoodLabel(String foodLabel) {
        this.foodLabel = foodLabel;
    }

    public Integer getFoodSupplyType() {
        return foodSupplyType;
    }

    public void setFoodSupplyType(Integer foodSupplyType) {
        this.foodSupplyType = foodSupplyType;
    }

    public String getFoodSupplyCycle() {
        return foodSupplyCycle;
    }

    public void setFoodSupplyCycle(String foodSupplyCycle) {
        this.foodSupplyCycle = foodSupplyCycle;
    }

    public Integer getFoodState() {
        return foodState;
    }

    public void setFoodState(Integer foodState) {
        this.foodState = foodState;
    }

    public Boolean getFoodIsHomePageShow() {
        return foodIsHomePageShow;
    }

    public void setFoodIsHomePageShow(Boolean foodIsHomePageShow) {
        this.foodIsHomePageShow = foodIsHomePageShow;
    }
}