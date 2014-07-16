package ngo.music.player.Fragments;


import java.util.ArrayList;

import ngo.music.player.R;
import ngo.music.player.Category.SongCategory;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class ListSongsFragment extends android.support.v4.app.Fragment {

	private GridView gridAllSongs;
	private SongCategory category;
	public ListSongsFragment(SongCategory category) {
		this.category = category;
	}
	public ListSongsFragment() {
		this.category = SongCategory.All;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.list_song_layout, container,
				false);

		gridAllSongs = (GridView) rootView.findViewById(R.id.gridAllSongs);

		/**
		 * Calling a backgroung thread will loads recent articles of a website
		 *
		 * @param rss
		 *            url of website
		 * */
		

//		gridAllSongs.setOnItemClickListener(BasicFunctions
//				.createOnItemClickListener());

		return rootView;
	}
}
