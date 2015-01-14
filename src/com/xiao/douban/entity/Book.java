package com.xiao.douban.entity;

import java.util.List;


public class Book {
	private int id;
	private String title;
	private String url;
	private String imageUrl;
	private Images images;
	private List<String> authors;
	private List<String> translator;
	private String publisher;
	private String pubdate;//出版日期
	private List<Tag> tags;//标签
	private String binding;//封面
	private float price;
	private Rate rating;//评分
	private Series series;//系列
	private int pages;
	private String authorIntro;//作者信息
	private String summary;//总结
	private String catalog;//序言
	private String ebookUrl;
	private float ebookPrice;
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
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Images getImages() {
		return images;
	}
	public void setImages(Images images) {
		this.images = images;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
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
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthorIntro() {
		return authorIntro;
	}
	public void setAuthorIntro(String authorIntro) {
		this.authorIntro = authorIntro;
	}
	public String getCatalog() {
		return catalog;
	}
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	public String getEbookUrl() {
		return ebookUrl;
	}
	public void setEbookUrl(String ebookUrl) {
		this.ebookUrl = ebookUrl;
	}
	public float getEbookPrice() {
		return ebookPrice;
	}
	public void setEbookPrice(float ebookPrice) {
		this.ebookPrice = ebookPrice;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	

}
