package ngo.music.player.Items;

public class SongItem {
	private String title;
	private int imageID;
	private String author;
	
	private String imageURL;

	//Contructor
	public SongItem(String title, String imageUrl, String author){
		this.title = title;
		this.imageURL = imageUrl;
		this.author  = author;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getImageID() {
		return imageID;
	}

	public void setImageID(int imageID) {
		this.imageID = imageID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
}
