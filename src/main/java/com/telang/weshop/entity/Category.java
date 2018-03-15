package com.telang.weshop.entity;

public class Category {
    private Integer id;

    private String name;

    private Integer fatherCategoryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFatherCategoryId() {
        return fatherCategoryId;
    }

    public void setFatherCategoryId(Integer fatherCategoryId) {
        this.fatherCategoryId = fatherCategoryId;
    }
}