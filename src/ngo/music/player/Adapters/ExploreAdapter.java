package ngo.music.player.Adapters;

import java.util.ArrayList;
import java.util.List;

import ngo.music.player.Items.ExploreItem;
import ngo.music.player.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ExploreAdapter extends ArrayAdapter<ExploreItem> {

	ArrayList<ExploreItem> exploreItems;
	public ExploreAdapter(Context context, int resource,
			ArrayList<ExploreItem> objects) {
		super(context, resource, objects);
		this.exploreItems =  objects;
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		// assign the view we are converting to a local variable
		View v = convertView;

		// first check to see if the view is null. if so, we have to inflate it.
		// to inflate it basically means to render, or show, the view.
		if (v == null) {
			LayoutInflater inflater = (LayoutInflater) getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inflater.inflate(R.layout.single_explore_layout, null);
		}

		/*
		 * Recall that the variable position is sent in as an argument to this
		 * method. The variable simply refers to the position of the current
		 * object in the list. (The ArrayAdapter iterates through the list we
		 * sent it)
		 * 
		 * Therefore, i refers to the current Item object.
		 */
		ExploreItem i = exploreItems.get(position);

		if (i != null) {

			// This is how you obtain a reference to the TextViews.
			// These TextViews are created in the XML files we defined.

			// Get Ids of element from layout
			TextView title = (TextView) v.findViewById(R.id.title);
			ImageView icon = (ImageView) v.findViewById(R.id.icon);
			

			// check to see if each individual textview is null.
			// if not, assign some text!
			if (title != null) {
				title.setText(i.getTitle());

			}
			// Display Icon
			if (icon != null) {
				icon.setImageResource(i.getIconId());
				//BasicFunctions.ResizeImageView((int) title.getTextSize(), icon);
			}
			// Display number of new post.
			// Only display if number > 0
			

		}

		// the view must be returned to our activity
		return v;

	}
}
