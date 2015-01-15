package com.xiao.douban.view;

import java.util.ArrayList;
import java.util.List;

import com.example.douban.R;
import com.xiao.douban.entity.Book;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
	private final Context context;
	private List<Book> books = new ArrayList<Book>();
	
	public ListViewAdapter(Context context, List<Book> books) {
		this.context = context;
		if (books != null) this.books = books;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return books.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			// 使用Vliew的对象itemView与R.layout.item关联
			convertView = inflater.inflate(R.layout.list_item, null);
			holder = new ViewHolder();
			holder.title = (TextView) convertView.findViewById(R.id.itemTitle);
			holder.publisher = (TextView) convertView.findViewById(R.id.itemText);
			holder.contactAvatar = (ImageView) convertView.findViewById(R.id.itemImage);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		Book book = books.get(position);
		holder.title.setText(book.getTitle());
		holder.publisher.setText(book.getPublisher());
		holder.contactAvatar.setImageResource(R.drawable.ic_launcher);
		return convertView;
	}
	
	private class ViewHolder {
		public TextView title;
		public TextView publisher;
		public ImageView contactAvatar;
	}

}
