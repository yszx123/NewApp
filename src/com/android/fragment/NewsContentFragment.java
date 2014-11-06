package com.android.fragment;

import com.android.newapp.R;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewsContentFragment extends Fragment {

	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.news_content_frag, container, false);
		return view;
	}

	public void refresh(String newsTitle, String newsContent) {
		View visibilityView = view.findViewById(R.id.visibility_layout);
		visibilityView.setVisibility(View.VISIBLE);
		TextView newsTitleText = (TextView) view.findViewById(R.id.news_title);
		TextView newsContentText = (TextView) view
				.findViewById(R.id.news_content);
		newsTitleText.setText(newsTitle);
		newsContentText.setText(newsContent);
	}

}
