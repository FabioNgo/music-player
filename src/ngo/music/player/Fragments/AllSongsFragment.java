package ngo.music.player.Fragments;


import ngo.music.player.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class AllSongsFragment extends Fragment {

	private GridView gridAllSongs;

	public AllSongsFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.all_song_layout, container,
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
