package com.android.newapp;

import com.android.fragment.NewsContentFragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class NewsContentActivity extends Activity {

	public static void actionStart(Context context, String title, String content) {
		Intent intent = new Intent(context, NewsContentActivity.class);
		intent.putExtra("title", title);
		intent.putExtra("content", content);
		context.startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.news_content_layout);
		String title = getIntent().getStringExtra("title");
		String content = getIntent().getStringExtra("content");
		NewsContentFragment nc = (NewsContentFragment) getFragmentManager()
				.findFragmentById(R.id.news_content_fragment);
		nc.refresh(title, content);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
