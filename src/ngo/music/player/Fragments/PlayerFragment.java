package ngo.music.player.Fragments;


import java.util.ArrayList;

import ngo.music.player.R;
import ngo.music.player.StaticVariable;
import ngo.music.player.Adapters.ListSongAdapter;
import ngo.music.player.Items.SongItem;
import ngo.vnexpress.reader.BasicFunctions.BasicFunctions;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.GridView;
import android.widget.ListView;

public class PlayerFragment extends android.app.Fragment {

	private ListView listSongs;
	private ArrayList<SongItem> songs;
	public PlayerFragment(ArrayList<SongItem> songs) {
		this.songs = songs;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.player_fragment, container,
				false);
		/**
		 * List Songs
		 */
		listSongs = (ListView)rootView.findViewById(R.id.list_songs);
		listSongs.getLayoutParams().height = (int) (StaticVariable.screenHeight*0.75);
		ListSongAdapter adapter = new ListSongAdapter(getActivity(), R.layout.single_song_layout, songs);
		listSongs.setAdapter(adapter);
		return rootView;
	}
}
