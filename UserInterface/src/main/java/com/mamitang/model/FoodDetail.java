package com.mamitang.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * model to show advertisement detail in the front
 * Created by lyy on 10/28/15.
 */
public class FoodDetail {
    private String foodName;
    private String hallName;
    private Integer foodState;
    private String hallPhone;
    private String hallAddress;
    private Integer foodSupplyType;
    private String foodSupplyCycle;
    private Date foodBeginSupplyDate;
    private Date foodEndSupplyDate;
    private BigDecimal foodPrice;
    private BigDecimal foodSupplyNum;
    private String foodPictureUrl;
    private String foodIntroduce;
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getHallName() {
        return hallName;
    }
    public void setHallName(String hallName) {
        this.hallName = hallName;
    }
    public Integer getFoodState() {
        return foodState;
    }
    public void setFoodState(Integer foodState) {
        this.foodState = foodState;
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
    public String getFoodPictureUrl() {
        return foodPictureUrl;
    }
    public void setFoodPictureUrl(String foodPictureUrl) {
        this.foodPictureUrl = foodPictureUrl;
    }
    public String getFoodIntroduce() {
        return foodIntroduce;
    }
    public void setFoodIntroduce(String foodIntroduce) {
        this.foodIntroduce = foodIntroduce;
    }
}
