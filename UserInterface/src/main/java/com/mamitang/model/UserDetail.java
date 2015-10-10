package com.mamitang.model;

import java.io.Serializable;
import java.util.Date;

/**
 * model to show user detail in the front
 * Created by lyy on 9/29/15.
 */
public class UserDetail implements Serializable {
    private String nickname;
    private Byte isactive;
    private Date createtime;
    private String address;
    private String bank;
    private String role;
    private String email;
    private String telephone;
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
