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
			// ��ҳģʽ
			NewsContentActivity.actionStart(getActivity(), news.getTitle(),
					news.getContent());
		}
	}

	private void getNews() {
		newsList = new ArrayList<New>();

		New n = new New();
		n.setTitle("10������ϲ���ʳ���Ա����������");
		n.setContent("����Ұݶ��ܶ����£����ǽ�����������ģ������Ĳ���⣬���Թٴ���˾��ҪƸ�õ���������ĳ���Ա���Ǿ���ζ����Ҫ���һЩ��������������⡣��������һЩ�����ô����������⣬��ô��������©�ܶ��ܸɵĳ���Ա����Ȼ�������������Ҫ������Щ�˲ţ���ô�����������Դ���������Զ�����������ͨ������˾Ϳ����ˡ�");
		newsList.add(n);

		New n1 = new New();
		n1.setTitle("���ÿյ�alt����ֵ����ҳ����ͼƬ����������");
		n1.setContent("��Ϊһ����ѧ��WEB����Ա���Ҷ�ʲô����ѵĿ���������һ���Լ����ɵ�ӡ�󣬵�������ô�����ʵ�����ҷ����кܶ�ϰ���ǲ���ȷ�ģ������Ǿ�����ô���꣬һЩ�ٷ���׼�Ѿ������޸ģ������ı䡣һ����С�ģ�������Ҫ���÷�������img����ϵ�alt�����÷�����������Ϊ��ҳ���ϵ�����ͼƬ��Ӧ������alt���ԡ�������ȴ���֣���ʵ������������");
		newsList.add(n1);

		New n2 = new New();
		n2.setTitle("����Ц������������Ա");
		n2.setContent("������Ա��Ĭ����һ��ר���ռ����ڳ���Ա��Ц�����ӡ���Ĭ���¡���ЦͼƬ�����������������Ƶ���ó���Ա�ڿ�Ƶ�coding֮�ྡ����ɵ���Ŀ������������ϴ�����Ǵ������ռ��������������Ͼ����༭�޸ģ����緭������Ļ��������˵���ȡ�Ҳ��һ������ԭ�����ݡ�");
		newsList.add(n2);

		New n3 = new New();
		n3.setTitle("10������ϲ���ʳ���Ա����������");
		n3.setContent("����Ұݶ��ܶ����£����ǽ�����������ģ������Ĳ���⣬���Թٴ���˾��ҪƸ�õ���������ĳ���Ա���Ǿ���ζ����Ҫ���һЩ��������������⡣��������һЩ�����ô����������⣬��ô��������©�ܶ��ܸɵĳ���Ա����Ȼ�������������Ҫ������Щ�˲ţ���ô�����������Դ���������Զ�����������ͨ������˾Ϳ����ˡ�");
		newsList.add(n3);

		New n4 = new New();
		n4.setTitle("10������ϲ���ʳ���Ա����������");
		n4.setContent("����Ұݶ��ܶ����£����ǽ�����������ģ������Ĳ���⣬���Թٴ���˾��ҪƸ�õ���������ĳ���Ա���Ǿ���ζ����Ҫ���һЩ��������������⡣��������һЩ�����ô����������⣬��ô��������©�ܶ��ܸɵĳ���Ա����Ȼ�������������Ҫ������Щ�˲ţ���ô�����������Դ���������Զ�����������ͨ������˾Ϳ����ˡ�");
		newsList.add(n4);

		New n5 = new New();
		n5.setTitle("10������ϲ���ʳ���Ա����������");
		n5.setContent("����Ұݶ��ܶ����£����ǽ�����������ģ������Ĳ���⣬���Թٴ���˾��ҪƸ�õ���������ĳ���Ա���Ǿ���ζ����Ҫ���һЩ��������������⡣��������һЩ�����ô����������⣬��ô��������©�ܶ��ܸɵĳ���Ա����Ȼ�������������Ҫ������Щ�˲ţ���ô�����������Դ���������Զ�����������ͨ������˾Ϳ����ˡ�");
		newsList.add(n5);
	}
}
