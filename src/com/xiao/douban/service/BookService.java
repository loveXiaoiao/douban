package com.xiao.douban.service;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiao.douban.entity.Book;
import com.xiao.douban.entity.SearchBook;


public class BookService {
	List<Book> books = new ArrayList<Book>();
	SearchBook searchBook = new SearchBook();
	
	public SearchBook jsonToEntity(String jsonStr){
		
		Gson gson = new Gson();
		java.lang.reflect.Type type = new TypeToken<SearchBook>() {}.getType();
		searchBook = gson.fromJson(jsonStr, type);
		return searchBook;
	}

}
