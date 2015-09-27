package com.mamitang.model;

import java.io.Serializable;

/**
 * Created by lyy on 15-9-25.
 * Object from the front form.
 */
public class UserRegisterDTO implements Serializable {
    public String username;
    public String password;
    public String specialDish;
    public String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
}
