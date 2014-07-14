package ngo.music.player.Items;

public class ExploreItem {
	private String title;
	private Integer iconId;
	public ExploreItem(String title, Integer iconId) {
		this.setTitle(title);
		this.setIconId(iconId);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getIconId() {
		return iconId;
	}
	public void setIconId(Integer iconId) {
		this.iconId = iconId;
	}
}
