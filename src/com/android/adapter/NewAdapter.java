package com.android.adapter;

import java.util.List;

import com.android.model.New;
import com.android.newapp.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class NewAdapter extends ArrayAdapter<New> {

	private int resourceId;

	public NewAdapter(Context context, int textViewResourceId, List<New> objects) {
		super(context, textViewResourceId, objects);
		this.resourceId = textViewResourceId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		New news = getItem(position);
		View view = null;
		if (convertView == null) {
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		} else {
			view = convertView;
		}
		TextView tv = (TextView) view.findViewById(R.id.news_title);
		tv.setText(news.getTitle());
		return view;
	}
}
