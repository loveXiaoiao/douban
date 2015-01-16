package com.xiao.douban.entity;

import java.io.Serializable;

public class Series implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4019967794207666753L;
	private int id;
	private String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
