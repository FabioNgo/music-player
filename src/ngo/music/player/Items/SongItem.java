package ngo.music.player.Items;

public class SongItem {
	private String title;

	private int songID;
	private String author;
	private String info;
	private String songUrl;
	private String imageUrl;

	//Contructor
	public SongItem(){
		
	}
	
	public SongItem(String title, String imageUrl, String author, String songUrl){
		this.setSongID(0);
		this.title = title;
		this.songUrl = songUrl;
		this.author  = author;
		this.imageUrl = imageUrl;
	}
	
	public SongItem(String title, String imageUrl, String author, String songUrl, String info){
		this.title = title;
		this.songUrl = songUrl;
		this.author  = author;
		this.info = info;
		this.imageUrl = imageUrl;
		this.songID = 0;
	}
	
	
	//GETTER AND SETTER
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSongURL() {
		return songUrl;
	}

	public void setSongURL(String imageURL) {
		this.songUrl = imageURL;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	public int getSongID() {
		return songID;
	}

	public void setSongID(int songID) {
		this.songID = songID;
	}
	
}
