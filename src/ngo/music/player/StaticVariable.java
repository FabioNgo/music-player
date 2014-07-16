package ngo.music.player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import ngo.music.player.Category.SongCategory;

public class StaticVariable {

	//Map the category in MusicCategory with the title in Explore Fragment
	public static final HashMap<SongCategory, String> CATEGORY_TITLE = new HashMap<SongCategory, String>();
	
	//Inital the hashmap
	static {
		CATEGORY_TITLE.put(SongCategory.All, "All");
		CATEGORY_TITLE.put(SongCategory.PopularMusic, "Popular Music");
		CATEGORY_TITLE.put(SongCategory.PopularAudio, "Popular Audio");
		CATEGORY_TITLE.put(SongCategory.Rock, "Rock");
		CATEGORY_TITLE.put(SongCategory.Electronic, "Electronic");
		CATEGORY_TITLE.put(SongCategory.Classical, "Classical");
		CATEGORY_TITLE.put(SongCategory.Pop, "Pop");
		CATEGORY_TITLE.put(SongCategory.Jazz, "Jazz");
		CATEGORY_TITLE.put(SongCategory.Rap, "Rap");
		CATEGORY_TITLE.put(SongCategory.HipHop, "Hip Hop");
		CATEGORY_TITLE.put(SongCategory.RnB, "R&B");
		CATEGORY_TITLE.put(SongCategory.Metal, "Metal");
		CATEGORY_TITLE.put(SongCategory.Reggae, "Reggae");
		CATEGORY_TITLE.put(SongCategory.Country, "Country");
		CATEGORY_TITLE.put(SongCategory.World, "World");
		CATEGORY_TITLE.put(SongCategory.Mixtape, "Mixtape");
		CATEGORY_TITLE.put(SongCategory.Blues, "Blues");
		CATEGORY_TITLE.put(SongCategory.Soul, "Soul");
		CATEGORY_TITLE.put(SongCategory.Dance, "Dance");
		CATEGORY_TITLE.put(SongCategory.Latin, "Latin");
		CATEGORY_TITLE.put(SongCategory.Ambient, "Ambient");
		CATEGORY_TITLE.put(SongCategory.AlternavtiveRock, "Alternative Rock");
		CATEGORY_TITLE.put(SongCategory.IndieRock, "Indue Rock");
		CATEGORY_TITLE.put(SongCategory.DeepHouse, "Deep House");
		CATEGORY_TITLE.put(SongCategory.Disco, "Disco");
		CATEGORY_TITLE.put(SongCategory.DrumBass, "Drum & Bass");
		CATEGORY_TITLE.put(SongCategory.Trance, "Trance");
		CATEGORY_TITLE.put(SongCategory.Dubstep, "Dubstep");
		CATEGORY_TITLE.put(SongCategory.Electro, "Electro");
		CATEGORY_TITLE.put(SongCategory.Folk, "Folk");
		CATEGORY_TITLE.put(SongCategory.HardcoreTechno, "Hardcore Techno");
		CATEGORY_TITLE.put(SongCategory.MiniamalTechno, "Minimal Techno");
		CATEGORY_TITLE.put(SongCategory.ProgressiveHouse, "Progressive House");
		CATEGORY_TITLE.put(SongCategory.Punk, "Punk");
		CATEGORY_TITLE.put(SongCategory.TechHouse, "Tech house");
		CATEGORY_TITLE.put(SongCategory.Trap, "Trap");
		CATEGORY_TITLE.put(SongCategory.TripHop, "Trip Hop");
		CATEGORY_TITLE.put(SongCategory.SingerSongWriter, "Singer-Songwriter");
		CATEGORY_TITLE.put(SongCategory.Audiobooks, "Audiobooks");
		CATEGORY_TITLE.put(SongCategory.Business, "Business");
		CATEGORY_TITLE.put(SongCategory.Comedy, "Comedy");
		CATEGORY_TITLE.put(SongCategory.Entertainment, "Entertainment");
		CATEGORY_TITLE.put(SongCategory.Learning, "Learning");
		CATEGORY_TITLE.put(SongCategory.NewsPolitics, "News  & Politics");
		CATEGORY_TITLE.put(SongCategory.Science, "Science");
		CATEGORY_TITLE.put(SongCategory.Sports, "Sports");
		CATEGORY_TITLE.put(SongCategory.Storytelling, "Storytelling");
		CATEGORY_TITLE.put(SongCategory.Technology, "Technology");
	}
	
	//Database name array
	public static final ArrayList<String> TABLE_NAME_ARRAY = new ArrayList<String>();
	//Initial Array
	static{
		TABLE_NAME_ARRAY.add("popular_music");
		TABLE_NAME_ARRAY.add("popular_audio");
		TABLE_NAME_ARRAY.add("rock");
		TABLE_NAME_ARRAY.add("electronic");
		TABLE_NAME_ARRAY.add("classical");
		TABLE_NAME_ARRAY.add("pop");
		TABLE_NAME_ARRAY.add("jazz");
		TABLE_NAME_ARRAY.add("rap");
		TABLE_NAME_ARRAY.add("hiphop");
		TABLE_NAME_ARRAY.add("rnb");
		TABLE_NAME_ARRAY.add("metal");
		TABLE_NAME_ARRAY.add("reggae");
		TABLE_NAME_ARRAY.add("country");
		TABLE_NAME_ARRAY.add("world");
		TABLE_NAME_ARRAY.add("mixtape");
		TABLE_NAME_ARRAY.add("blues");
		TABLE_NAME_ARRAY.add("soul");
		TABLE_NAME_ARRAY.add("dance");
		TABLE_NAME_ARRAY.add("latin");
		TABLE_NAME_ARRAY.add("ambient");
		TABLE_NAME_ARRAY.add("alternative_rock");
		TABLE_NAME_ARRAY.add("indie_rock");
		TABLE_NAME_ARRAY.add("deep_house");
		TABLE_NAME_ARRAY.add("disco");
		TABLE_NAME_ARRAY.add("drum_bass");
		TABLE_NAME_ARRAY.add("trance");
		TABLE_NAME_ARRAY.add("dubstep");
		TABLE_NAME_ARRAY.add("electro");
		TABLE_NAME_ARRAY.add("folk");
		TABLE_NAME_ARRAY.add("hardcore_techno");
		TABLE_NAME_ARRAY.add("minimal_techno");
		TABLE_NAME_ARRAY.add("progressive_house");
		TABLE_NAME_ARRAY.add("punk");
		TABLE_NAME_ARRAY.add("tech_house");
		TABLE_NAME_ARRAY.add("trap");
		TABLE_NAME_ARRAY.add("trip_hop");
		TABLE_NAME_ARRAY.add("singer_song_writer");
		TABLE_NAME_ARRAY.add("audiobooks");
		TABLE_NAME_ARRAY.add("business");
		TABLE_NAME_ARRAY.add("comedy");
		TABLE_NAME_ARRAY.add("entertainment");
		TABLE_NAME_ARRAY.add("learning");
		TABLE_NAME_ARRAY.add("news_politics");
		TABLE_NAME_ARRAY.add("science");
		TABLE_NAME_ARRAY.add("sports");
		TABLE_NAME_ARRAY.add("storytelling");
		TABLE_NAME_ARRAY.add("technology");
		
	}
		
	
	
}
