package com.firstdemo.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {
	private String name;
	
//	@JsonIgnore
	private Integer sno;
	
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a", locale="zh", timezone="GMT+8")
	private Date goschool;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public Date getGoschool() {
		return goschool;
	}
	public void setGoschool(Date goschool) {
		this.goschool = goschool;
	}
	
}
