package com.telang.weshop.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProductDetail {
	private Integer id;

	private String title;
	// 产品主图
	private String image;
	// 分类名称
	private String category;

	private Double price;

	private Integer stock;

	private Integer shelves;

	private Integer salesNum;

	private Integer collectionNum;

	private Integer sortWhight;
	
	private Date addTime;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")  
	public Date getAddTime() {
		return addTime;
	}
	
//	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return category;
	}

	public void setName(String category) {
		this.category = category;
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

}