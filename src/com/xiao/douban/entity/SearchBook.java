package com.xiao.douban.entity;

import java.io.Serializable;
import java.util.List;

public class SearchBook implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6661424994292299682L;
	private int start;
	private int count;
	private int	total;
	private List<Book> books;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	

}
