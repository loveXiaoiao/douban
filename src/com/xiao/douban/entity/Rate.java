package com.xiao.douban.entity;

public class Rate {
	private float max;//最高分
	private long numRaters;//总评分人
	private float average;//平均分
	private float min;//最低分
	public float getMax() {
		return max;
	}
	public void setMax(float max) {
		this.max = max;
	}
	public long getNumRaters() {
		return numRaters;
	}
	public void setNumRaters(long numRaters) {
		this.numRaters = numRaters;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public float getMin() {
		return min;
	}
	public void setMin(float min) {
		this.min = min;
	}
	

}
