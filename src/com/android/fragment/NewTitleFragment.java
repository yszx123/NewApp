package com.android.fragment;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.android.adapter.NewAdapter;
import com.android.model.New;
import com.android.newapp.NewsContentActivity;
import com.android.newapp.R;

public class NewTitleFragment extends Fragment implements OnItemClickListener {

	private ListView listView;

	private List<New> newsList;

	private NewAdapter adapter;

	private boolean isTwoPanel;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		getNews();
		adapter = new NewAdapter(activity, R.layout.news_item_layout, newsList);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.news_title_frag_layout,
				container, false);
		listView = (ListView) view.findViewById(R.id.news_title_list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);

		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);

		isTwoPanel = getActivity().findViewById(R.layout.news_content_layout) != null;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		New news = newsList.get(position);

		if (isTwoPanel) {
			NewsContentFragment nc = (NewsContentFragment) getFragmentManager()
					.findFragmentById(R.id.news_content_fragment);
			nc.refresh(news.getTitle(), news.getContent());
		} else {
			// 单页模式
			NewsContentActivity.actionStart(getActivity(), news.getTitle(),
					news.getContent());
		}
	}

	private void getNews() {
		newsList = new ArrayList<New>();

		New n = new New();
		n.setTitle("10个我最喜欢问程序员的面试问题");
		n.setContent("最近我拜读很多文章，都是介绍面试问题的，我真心不理解，面试官代表公司想要聘用的是最优秀的程序员，那就意味着需要想出一些有意义的面试问题。如果你就提一些毫无用处的垃圾问题，那么很容易遗漏很多能干的程序员。当然如果你觉得你就是要吓跑这些人才，那么你就让人力资源部门来面试而不是真正精通程序的人就可以了。");
		newsList.add(n);

		New n1 = new New();
		n1.setTitle("设置空的alt属性值，让页面上图片更具易用性");
		n1.setContent("作为一个自学的WEB程序员，我对什么是最佳的开发方法有一个自己养成的印象，但经过这么多年的实践，我发现有很多习惯是不正确的，或者是经过这么多年，一些官方标准已经经过修改，有所改变。一个很小的，但很重要的用法，就是img标记上的alt属性用法。我曾经以为，页面上的所有图片都应该设置alt属性。但现在却发现，事实并不是这样。");
		newsList.add(n1);

		New n2 = new New();
		n2.setTitle("【苦笑话】别做程序员");
		n2.setContent("“程序员幽默”是一档专门收集关于程序员的笑话段子、幽默故事、搞笑图片、讽刺漫画、娱乐视频等让程序员在苦逼的coding之余尽情放松的栏目。本栏里的资料大多数是从网上收集而来，部分资料经过编辑修改，比如翻译成中文或添加中文说明等。也有一部分是原创内容。");
		newsList.add(n2);

		New n3 = new New();
		n3.setTitle("10个我最喜欢问程序员的面试问题");
		n3.setContent("最近我拜读很多文章，都是介绍面试问题的，我真心不理解，面试官代表公司想要聘用的是最优秀的程序员，那就意味着需要想出一些有意义的面试问题。如果你就提一些毫无用处的垃圾问题，那么很容易遗漏很多能干的程序员。当然如果你觉得你就是要吓跑这些人才，那么你就让人力资源部门来面试而不是真正精通程序的人就可以了。");
		newsList.add(n3);

		New n4 = new New();
		n4.setTitle("10个我最喜欢问程序员的面试问题");
		n4.setContent("最近我拜读很多文章，都是介绍面试问题的，我真心不理解，面试官代表公司想要聘用的是最优秀的程序员，那就意味着需要想出一些有意义的面试问题。如果你就提一些毫无用处的垃圾问题，那么很容易遗漏很多能干的程序员。当然如果你觉得你就是要吓跑这些人才，那么你就让人力资源部门来面试而不是真正精通程序的人就可以了。");
		newsList.add(n4);

		New n5 = new New();
		n5.setTitle("10个我最喜欢问程序员的面试问题");
		n5.setContent("最近我拜读很多文章，都是介绍面试问题的，我真心不理解，面试官代表公司想要聘用的是最优秀的程序员，那就意味着需要想出一些有意义的面试问题。如果你就提一些毫无用处的垃圾问题，那么很容易遗漏很多能干的程序员。当然如果你觉得你就是要吓跑这些人才，那么你就让人力资源部门来面试而不是真正精通程序的人就可以了。");
		newsList.add(n5);
	}
}
