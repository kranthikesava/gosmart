package com.akhm.admin.dao.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_TL")
public class ProductTl {
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Integer productId;
	@Column(name = "PRODUCT_TYPE_ID")
	private Integer productTypeId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "PRODUCT_DESCRIPTION")
	private String productDescription;
	@Column(name = "PRODUCT_PRICE")
	private Double productPrice;
	@Column(name = "PRODUCT_MANUFACTURE_DATE")
	private Date productManufactureDate;
	@Column(name = "PRODUCT_EXPIRY_DATE")
	private Date productExpiryDate;
	@Column(name = "PRODUCT_STATUS")
	private String productStatus;

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductTypeId(Integer productTypeId)
	{
		this.productTypeId =productTypeId;
	}
	public Integer getProductTypeId()
	{
		return productTypeId;
	}
	
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public String getProductName()
	{
		return productName;
	}
	public void setProductDescription(String productDescription)
	{
		this.productDescription=productDescription;
	}
	public String getProductDescription()
	{
		return productDescription;
	}
	public void setProductPrice(Double productPrice)
	{
		this.productPrice=productPrice;
	}
	public Double getProductPrice()
	{
		return productPrice;
	}
	public void setProductManufactureDate(Date productManufactureDate)
	{
		this.productManufactureDate=productManufactureDate;
	}
	public Date getProductManufactureDate()
	{
		return productManufactureDate;
	}
	public void setProductExpiryDate(Date productExpiryDate)
	{
		this.productExpiryDate=productExpiryDate;
	}
	public Date getProductExpireDate()
	{
		return productExpiryDate;
	}
	public void setProductStatus(String productStatus)
	{
		this.productStatus=productStatus;
	}
	public String getProductStatus()
	{
		return productStatus;
	}
	
	

}