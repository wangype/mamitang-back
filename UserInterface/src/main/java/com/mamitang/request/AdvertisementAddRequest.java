package com.mamitang.request;

import java.util.List;
import java.util.Map;

/**
 * Created by lyy on 10/19/15.
 */
public class AdvertisementAddRequest {
    private String name;
    private List<Map<String , String>> imgs;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Map<String, String>> getImgs() {
        return imgs;
    }
    public void setImgs(List<Map<String, String>> imgs) {
        this.imgs = imgs;
    }
}
