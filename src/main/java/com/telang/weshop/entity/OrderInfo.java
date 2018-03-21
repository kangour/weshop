package com.telang.weshop.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrderInfo {
    private Integer id;  //订单id

    private Integer productId; //商品id 

    private Integer userId;//用户id

    private Integer statusId; //状态id

    private Double price;//订单总价

    private Date time; //订单时间

    private String status; //订单状态
    private String userName; //用户名
    private String acceptName; //收件人信息
    private String acceptRegion;//收货地址
    private String streetAddress; //收货纤细地址
    private String phoneNumber; //联系电话
    private String zipcode; //邮政编码
    private String title; //商品名称
    private Integer productNum;//商品数量
    
    
    
    

    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAcceptName() {
		return acceptName;
	}

	public void setAcceptName(String acceptName) {
		this.acceptName = acceptName;
	}

	public String getAcceptRegion() {
		return acceptRegion;
	}

	public void setAcceptRegion(String acceptRegion) {
		this.acceptRegion = acceptRegion;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getProductNum() {
		return productNum;
	}

	public void setProductNum(Integer productNum) {
		this.productNum = productNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") 
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}