package com.xiao.douban.entity;

import java.io.Serializable;
import java.util.List;


public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6497332078343050517L;
	private int id;
	private String title;
	private String url;
	private String image;
	private Images images;
	private List<String> author;
	private List<String> translator;
	private String publisher;
	private String pubdate;//出版日期
	private List<Tag> tags;//标签
	private String binding;//封面
	private String price;
	private Rate rating;//评分
	private Series series;//系列
	private String pages;
	private String author_intro;//作者信息
	private String summary;//总结
	private String catalog;//序言
	private String ebook_url;
	private String ebook_price;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Images getImages() {
		return images;
	}
	public void setImages(Images images) {
		this.images = images;
	}
	public List<String> getAuthor() {
		return author;
	}
	public void setAuthor(List<String> author) {
		this.author = author;
	}
	public List<String> getTranslator() {
		return translator;
	}
	public void setTranslator(List<String> translator) {
		this.translator = translator;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public String getBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		this.binding = binding;
	}
	public Rate getRating() {
		return rating;
	}
	public void setRating(Rate rating) {
		this.rating = rating;
	}
	public Series getSeries() {
		return series;
	}
	public void setSeries(Series series) {
		this.series = series;
	}
	public String getAuthor_intro() {
		return author_intro;
	}
	public void setAuthor_intro(String author_intro) {
		this.author_intro = author_intro;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCatalog() {
		return catalog;
	}
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getEbook_url() {
		return ebook_url;
	}
	public void setEbook_url(String ebook_url) {
		this.ebook_url = ebook_url;
	}
	public String getEbook_price() {
		return ebook_price;
	}
	public void setEbook_price(String ebook_price) {
		this.ebook_price = ebook_price;
	}
	
	

}
