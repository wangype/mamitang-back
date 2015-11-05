package com.mamitang.model;

/**
 * Created by lyy on 10/19/15.
 * 代表广告添加接口请求参数中的图片模型
 */
public class AdImgModel {
    private String url;
    private String description;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
