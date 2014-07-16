package ngo.music.player.Fragments;

import ngo.music.player.R;
import ngo.music.player.MainActivity.PlaceholderFragment;
import android.app.FragmentManager;
import android.support.v4.app.Fragment;


public class MainSongFragment extends Fragment implements
NavigationDrawerFragment.NavigationDrawerCallbacks {

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		// TODO Auto-generated method stub
		// update the main content by replacing fragments
				android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
				switch (position) {
				case 1:
					fragmentManager
					.beginTransaction()
					.replace(R.id.container, new AllSongsFragment()).commit();
						
					break;

				default:
					fragmentManager
					.beginTransaction()
					.replace(R.id.container,
							new AllSongsFragment()).commit();
					break;
				}
		
	}
	
}
