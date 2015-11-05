package com.mamitang.request;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lyy on 10/30/15.
 */
public class FoodUpdateRequest {
    private String foodName;
    private Integer foodState;
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

    public Integer getFoodState() {
        return foodState;
    }

    public void setFoodState(Integer foodState) {
        this.foodState = foodState;
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
