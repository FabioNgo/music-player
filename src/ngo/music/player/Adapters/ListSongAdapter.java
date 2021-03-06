package ngo.music.player.Adapters;

import java.util.ArrayList;

import ngo.music.player.MainActivity;
import ngo.music.player.R;
import ngo.music.player.StaticVariable;
import ngo.music.player.Imageloader.ImageLoader;
import ngo.music.player.Items.SongItem;
import ngo.vnexpress.reader.BasicFunctions.BasicFunctions;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListSongAdapter  extends ArrayAdapter<SongItem>{

	public ListSongAdapter(Context context, int resource) {
		super(context, resource);
		// TODO Auto-generated constructor stub
	}
	// declaring our ArrayList of items
		private ArrayList<SongItem> songs;

		/*
		 * here we must override the constructor for ArrayAdapter the only variable
		 * we care about now is ArrayList<Item> objects, because it is the list of
		 * objects we want to display.
		 */
		public ListSongAdapter(Context context, int textViewResourceId,
				ArrayList<SongItem> songs) {
			super(context, textViewResourceId, songs);
			this.songs = songs;
		}

		/*
		 * we are overriding the getView method here - this is what defines how each
		 * list item will look.
		 */
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			// assign the view we are converting to a local variable
			View v = convertView;

			// first check to see if the view is null. if so, we have to inflate it.
			// to inflate it basically means to render, or show, the view.
			if (v == null) {
				LayoutInflater inflater = (LayoutInflater) getContext()
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				v = inflater
						.inflate(R.layout.single_song_layout, null);

			}

			/*
			 * Recall that the variable position is sent in as an argument to this
			 * method. The variable simply refers to the position of the current
			 * object in the list. (The ArrayAdapter iterates through the list we
			 * sent it)
			 * 
			 * Therefore, i refers to the current Item object.
			 */
			SongItem i = songs.get(position);
			if (i != null) {

				// This is how you obtain a reference to the TextViews.
				// These TextViews are created in the XML files we defined.

				TextView title = (TextView) v.findViewById(R.id.title);
				ImageView avatar = (ImageView) v.findViewById(R.id.avatar);
				TextView author = (TextView) v.findViewById(R.id.author);
				
				if (title != null) {
					title.setText(i.getTitle());
				}
				//
				if (avatar != null) {
					int size = (int) (StaticVariable.screenWidth * 0.2);
					 avatar.getLayoutParams().width = size;
					avatar.getLayoutParams().height = size;
					
					ImageLoader imgLoader = new ImageLoader(getContext());
					// Loader image - will be shown before loading image
					int loader = R.drawable.image_not_found;
					
					imgLoader.DisplayImage(i.getImageUrl(), loader, avatar);
					

				}
				if (author != null) {
					author.setText(i.getAuthor());
				}
				// if (content != null){
				// content.setText(i.getDescription());
				// }
				// if (timestamp != null){
				// timestamp.setText(i.getPubdate());
				// }

			}
			return v;
		}

}
