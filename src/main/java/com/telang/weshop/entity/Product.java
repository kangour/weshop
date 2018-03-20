package com.telang.weshop.entity;

import java.util.Date;

public class Product {
    private Integer id;

    private String title;

    private Integer mainImage;

    private Double price;

    private Integer stock;

    private Integer shelves;

    private Integer salesNum;

    private Integer collectionNum;

    private Integer sortWhight;

    private Date addTime;

    private Integer Categories;
    
    public Integer getCategories() {
		return Categories;
	}

	public void setCategories(Integer categories) {
		Categories = categories;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getMainImage() {
        return mainImage;
    }

    public void setMainImage(Integer mainImage) {
        this.mainImage = mainImage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getShelves() {
        return shelves;
    }

    public void setShelves(Integer shelves) {
        this.shelves = shelves;
    }

    public Integer getSalesNum() {
        return salesNum;
    }

    public void setSalesNum(Integer salesNum) {
        this.salesNum = salesNum;
    }

    public Integer getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }

    public Integer getSortWhight() {
        return sortWhight;
    }

    public void setSortWhight(Integer sortWhight) {
        this.sortWhight = sortWhight;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}