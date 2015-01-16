package com.xiao.douban.entity;

import java.io.Serializable;

public class Images implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7709118080119497554L;
	private String small;
	private String large;
	private String medium;
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getSmall() {
		return small;
	}
	public void setSmall(String small) {
		this.small = small;
	}
	public String getLarge() {
		return large;
	}
	public void setLarge(String large) {
		this.large = large;
	}

}
