package ngo.music.player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import ngo.music.player.Category.MusicCategory;

public class StaticVariable {

	//Map the category in MusicCategory with the title in Explore Fragment
	public static final HashMap<MusicCategory, String> CATEGORY_TITLE = new HashMap<MusicCategory, String>();
	
	//Inital the hashmap
	static {
		CATEGORY_TITLE.put(MusicCategory.PopularMusic, "Popular Music");
		CATEGORY_TITLE.put(MusicCategory.PopularAudio, "Popular Audio");
		CATEGORY_TITLE.put(MusicCategory.Rock, "Rock");
		CATEGORY_TITLE.put(MusicCategory.Electronic, "Electronic");
		CATEGORY_TITLE.put(MusicCategory.Classical, "Classical");
		CATEGORY_TITLE.put(MusicCategory.Pop, "Pop");
		CATEGORY_TITLE.put(MusicCategory.Jazz, "Jazz");
		CATEGORY_TITLE.put(MusicCategory.Rap, "Rap");
		CATEGORY_TITLE.put(MusicCategory.HipHop, "Hip Hop");
		CATEGORY_TITLE.put(MusicCategory.RnB, "R&B");
		CATEGORY_TITLE.put(MusicCategory.Metal, "Metal");
		CATEGORY_TITLE.put(MusicCategory.Reggae, "Reggae");
		CATEGORY_TITLE.put(MusicCategory.Country, "Country");
		CATEGORY_TITLE.put(MusicCategory.World, "World");
		CATEGORY_TITLE.put(MusicCategory.Mixtape, "Mixtape");
		CATEGORY_TITLE.put(MusicCategory.Blues, "Blues");
		CATEGORY_TITLE.put(MusicCategory.Soul, "Soul");
		CATEGORY_TITLE.put(MusicCategory.Dance, "Dance");
		CATEGORY_TITLE.put(MusicCategory.Latin, "Latin");
		CATEGORY_TITLE.put(MusicCategory.Ambient, "Ambient");
		CATEGORY_TITLE.put(MusicCategory.AlternavtiveRock, "Alternative Rock");
		CATEGORY_TITLE.put(MusicCategory.IndieRock, "Indue Rock");
		CATEGORY_TITLE.put(MusicCategory.DeepHouse, "Deep House");
		CATEGORY_TITLE.put(MusicCategory.Disco, "Disco");
		CATEGORY_TITLE.put(MusicCategory.DrumBass, "Drum & Bass");
		CATEGORY_TITLE.put(MusicCategory.Trance, "Trance");
		CATEGORY_TITLE.put(MusicCategory.Dubstep, "Dubstep");
		CATEGORY_TITLE.put(MusicCategory.Electro, "Electro");
		CATEGORY_TITLE.put(MusicCategory.Folk, "Folk");
		CATEGORY_TITLE.put(MusicCategory.HardcoreTechno, "Hardcore Techno");
		CATEGORY_TITLE.put(MusicCategory.MiniamalTechno, "Minimal Techno");
		CATEGORY_TITLE.put(MusicCategory.ProgressiveHouse, "Progressive House");
		CATEGORY_TITLE.put(MusicCategory.Punk, "Punk");
		CATEGORY_TITLE.put(MusicCategory.TechHouse, "Tech house");
		CATEGORY_TITLE.put(MusicCategory.Trap, "Trap");
		CATEGORY_TITLE.put(MusicCategory.TripHop, "Trip Hop");
		CATEGORY_TITLE.put(MusicCategory.SingerSongWriter, "Singer-Songwriter");
		CATEGORY_TITLE.put(MusicCategory.Audiobooks, "Audiobooks");
		CATEGORY_TITLE.put(MusicCategory.Business, "Business");
		CATEGORY_TITLE.put(MusicCategory.Comedy, "Comedy");
		CATEGORY_TITLE.put(MusicCategory.Entertainment, "Entertainment");
		CATEGORY_TITLE.put(MusicCategory.Learning, "Learning");
		CATEGORY_TITLE.put(MusicCategory.NewsPolitics, "News  & Politics");
		CATEGORY_TITLE.put(MusicCategory.Science, "Science");
		CATEGORY_TITLE.put(MusicCategory.Sports, "Sports");
		CATEGORY_TITLE.put(MusicCategory.Storytelling, "Storytelling");
		CATEGORY_TITLE.put(MusicCategory.Technology, "Technology");
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
