package com.xiao.douban;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import com.example.douban.R;
import com.xiao.douban.activity.DetailInfo;
import com.xiao.douban.entity.Book;
import com.xiao.douban.entity.SearchBook;
import com.xiao.douban.service.BookService;
import com.xiao.douban.util.HttpUtil;
import com.xiao.douban.view.ListViewAdapter;

public class MainActivity extends Activity {
	private ListView listView;
	private Button searchBtn = null;// 搜索
	private EditText mText = null;// 搜索条件
	public String uriAPI = "https://api.douban.com/v2/book/search?q=";
	private String resultStr = "";
	List<Book> books = new ArrayList<Book>();
	SearchBook searchBook = new SearchBook();
	BookService bookService = new BookService();
	ListViewAdapter adapter = new ListViewAdapter(MainActivity.this, books);
	private Handler handler=null;  

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		handler=new Handler();  
		searchBtn = (Button) findViewById(R.id.search);
		listView = (ListView) this.findViewById(R.id.MyListItem);
		mText = (EditText) findViewById(R.id.mText);
		searchBtn.setOnClickListener(mGetClickListener);
//		books = searchBook.getBooks();
//		adapter = new ListViewAdapter(this, books);
//		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view,
					int position, long id) {
				Intent dialIntent = new Intent(MainActivity.this, DetailInfo.class);
				startActivity(dialIntent);
			}
		});
	}

	private OnClickListener mGetClickListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			new Thread() {
				@Override
				public void run() {
					try {
						String mtext = mText.getText().toString();
						if (mtext == null || "".equals(mtext)) {
							Looper.prepare();     
							Toast.makeText(MainActivity.this, "请输入查询参数！",Toast.LENGTH_SHORT).show();
							Looper.loop();
						} else {
							resultStr = HttpUtil.initSSLAllWithHttpClient(uriAPI+mtext);
							handler.post(runnableUi);
						}
					} catch (ClientProtocolException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}.start();

		}
	};
	// 构建Runnable对象，在runnable中更新界面  
    Runnable   runnableUi=new  Runnable(){  
        @Override  
        public void run() {  
            //更新界面  
        	searchBook = bookService.jsonToEntity(resultStr);
			books = searchBook.getBooks();
			adapter = new ListViewAdapter(MainActivity.this, books);
			listView.setAdapter(adapter);
        }  
          
    };  

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
