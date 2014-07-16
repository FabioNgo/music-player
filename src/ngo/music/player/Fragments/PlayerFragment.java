package ngo.music.player.Fragments;


import ngo.music.player.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class PlayerFragment extends android.support.v4.app.Fragment {

	private GridView gridAllSongs;

	public PlayerFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.player_fragment, container,
				false);

		

		

//		
		return rootView;
	}
}
