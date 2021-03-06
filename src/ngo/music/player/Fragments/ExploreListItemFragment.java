package ngo.music.player.Fragments;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import ngo.music.player.R;
import ngo.music.player.StaticVariable;
import ngo.music.player.Adapters.ExploreAdapter;
import ngo.music.player.Category.SongCategory;
import ngo.music.player.Items.ExploreItem;
import ngo.music.player.Items.SongItem;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ExploreListItemFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.explore_fragment, container,
				false);

		//Add item in Explore tab
		
		ArrayList<ExploreItem> exploreItems = new ArrayList<ExploreItem>();
		for (SongCategory category : SongCategory.values()){
			exploreItems.add(new ExploreItem(StaticVariable.CATEGORY_TITLE.get(category),R.drawable.ic_launcher));
		}
				
		ExploreAdapter exploreAdapter = new ExploreAdapter(getActivity(), R.layout.single_explore_layout, exploreItems);
		ListView exploreListView = (ListView)rootView.findViewById(R.id.explore_list_view);
		exploreListView.setAdapter(exploreAdapter);
		exploreListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				ArrayList<SongItem> songs = new ArrayList<SongItem>();
				songs.add(new SongItem());
				songs.add(new SongItem());
				PlayerFragment fragment = new PlayerFragment(songs);
				FragmentManager fragmentManager  = getFragmentManager();
				fragmentManager.beginTransaction().replace(R.id.container,fragment).commit();
			}
			
		});
		
		
		return rootView;
	}
}
