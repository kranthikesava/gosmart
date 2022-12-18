package com.akhm.admin.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_TYPE_TL")
public class ProductTypeTl {
	@Id
	@Column(name="PRODUCT_TYPE_ID")
	@GeneratedValue
	private Integer productTypeId;
	@Column(name="PRODUCT_TYPE_NAME")
	private String productTypeName;
	@Column(name="PRODUCT_TYPE_DESRIPTION")
	private String productTypeDesription;
	public Integer getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getProductTypeName() {
		return productTypeName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}
	public String getProductTypeDesription() {
		return productTypeDesription;
	}
	public void setProductTypeDesription(String productTypeDesription) {
		this.productTypeDesription = productTypeDesription;
	}
	

}
