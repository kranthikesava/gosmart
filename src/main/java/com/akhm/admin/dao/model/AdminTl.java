package com.akhm.admin.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN_TL")
public class AdminTl {
	@Id
	@Column(name="ADMIN_ID")
	@GeneratedValue
	private Integer adminId;
	@Column(name="FRIST_NAME")
	private String fristName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL_ID")
	private String emailId;
	@Column(name="PASSWORD")
	private String password;
	public void setAdminId(Integer adminId)
	{
		this.adminId=adminId;
	}
	public Integer getAdminId()
	{
		return adminId;
	}
	public void setFristName(String fristName)
	{
		this.fristName=fristName;
	}
	public String getFristName()
	{
		return fristName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setEmailId(String emailId)
	{
		this.emailId=emailId;
	}
	public String getEmailId()
	{
		return emailId;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
}
