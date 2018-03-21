package com.telang.weshop.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProductImages {
    private Integer id;

    private String productId;

    private String image;

    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") 
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}