/**
 * Function:
 * 	Add a new row in websites table
	Returns all the rows as Website class objects
	Update existing row
	Returns single row
	Deletes a single row
	Check if a website is already existed
 */
package ngo.music.player.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import ngo.music.player.MainActivity;
import ngo.music.player.StaticVariable;

import ngo.music.player.Category.SongCategory;
import ngo.music.player.Items.SongItem;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SongDatabaseHandler extends SQLiteOpenHelper {

	// Database Version
	private static final int DATABASE_VERSION = 1;

	// Database Name
	private static final String DATABASE_NAME = "data_songs";

	// Contacts table name
	private static String SONG_TABLE = "songs";
	
	private static SongDatabaseHandler mInstance = null;

	// Contacts Table Columns names
	private static final String KEY_ID = "id";
	private static final String KEY_TITLE = "title";
	private static final String KEY_SONG_URL = "song_url";
	private static final String KEY_AUTHOR = "author";
	private static final String KEY_IMAGE_URL = "image_url";
	private static final String KEY_INFO = "info";
	// String of table-name
	//private String table_name_array[] = { MusicCategory.values().toString() };

	// private long insertedRowIndex;

	public SongDatabaseHandler(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		
		
		
	}

	// Creating Tables
	@Override
	public void onCreate(SQLiteDatabase db) {

		for (String table_name : StaticVariable.TABLE_NAME_ARRAY) {
			String CREATE_RSS_TABLE = "CREATE TABLE " + table_name + "("
					+ KEY_ID + " INTEGER PRIMARY KEY, " + KEY_TITLE + " TEXT, "
					+ KEY_SONG_URL + " TEXT, " + KEY_IMAGE_URL + " TEXT, "
					+ KEY_INFO + " TEXT, " + KEY_AUTHOR + " TEXT " + ");";
			db.execSQL(CREATE_RSS_TABLE);
		}

	}
	
	

	// Upgrading database
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + SONG_TABLE);

		// Create tables again
		onCreate(db);
	}

	
	  public static SongDatabaseHandler getInstance(Context ctx) {

		    // Use the application context, which will ensure that you 
		    // don't accidentally leak an Activity's context.
		    // See this article for more information: http://bit.ly/6LRzfx
		    if (mInstance == null) {
		      mInstance = new SongDatabaseHandler(ctx.getApplicationContext());
		    }
		    return mInstance;
		  }
	  
	/**
	 * Adding a new website in websites table Function will check if a site
	 * already existed in database. If existed will update the old one else
	 * creates a new row
	 * */
	public void addSite(SongItem song) {
		SONG_TABLE = getTableName();
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_TITLE, song.getTitle()); // site title
		//values.put(KEY_LINK, song.getLink()); // site url
		values.put(KEY_SONG_URL, song.getSongURL()); // rss img
		//values.put(KEY_DESCRIPTION, site.getDescription()); // site description
		values.put(KEY_AUTHOR, song.getAuthor());
		values.put(KEY_IMAGE_URL, song.getImageUrl());
		//values.put(KEY_PUBLIC_DATE, site.getPubDate()); // public date
		// Check if row already existed in database
		if (!isSongExists(db, song.getSongURL())) {
			// site not existed, create a new row
			db.insert(SONG_TABLE, null, values);
			db.close();
		} else {
			// site already existed update the row
			updateSong(song);
			db.close();
		}
	}

	/**
	 * Reading all rows from database
	 * */
	public List<SongItem> getAllSongsByID() {
		SONG_TABLE = getTableName();
		List<SongItem> songList = new ArrayList<SongItem>();
		//Log.d("DEBUG", "SQL " + TABLE_RSS);
		// Select All Query
		String selectQuery = "SELECT  * FROM " + SONG_TABLE + " ORDER BY "
				+ KEY_ID + " DESC";

		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				SongItem song = new SongItem();
				song.setSongID(Integer.parseInt(cursor.getString(0)));
				song.setTitle(cursor.getString(1));
				song.setSongURL(cursor.getString(2));
				song.setImageUrl(cursor.getString(3));
				song.setInfo(cursor.getString(4));
				song.setAuthor(cursor.getString(5));
				// Adding contact to list
				//Log.d("DEBUG", "SQL " + String.valueOf(site.getId()));
				songList.add(song);
			} while (cursor.moveToNext());
		}
		cursor.close();
		db.close();

		// return contact list

		return songList;
	}

	// /**
	// * Reading all rows from database
	// * */
	// public List<WebSite> getAllSitesLimited(int limitedNumber) {
	// int count = 0;
	// List<WebSite> siteList = new ArrayList<WebSite>();
	// // Select All Query
	// String selectQuery = "SELECT * FROM " + TABLE_RSS
	// + " ORDER BY " + KEY_ID + " DESC";
	//
	// SQLiteDatabase db = this.getReadableDatabase();
	// Cursor cursor = db.rawQuery(selectQuery, null);
	//
	// // looping through all rows and adding to list
	// if (cursor.moveToFirst()) {
	// do {
	// count++;
	// WebSite site = new WebSite();
	// site.setId(Integer.parseInt(cursor.getString(0)));
	// site.setTitle(cursor.getString(1));
	// site.setLink(cursor.getString(2));
	// site.setImageLink(cursor.getString(3));
	// site.setDescription(cursor.getString(4));
	// site.setPubDate(cursor.getString(5));
	// // Adding contact to list
	// siteList.add(site);
	// } while (cursor.moveToNext() && count < limitedNumber);
	// }
	// cursor.close();
	// db.close();
	//
	// // return contact list
	//
	// return siteList;
	// }

	/**
	 * Updating a single row row will be identified by rss link
	 * */
	public int updateSong(SongItem song) {
		SONG_TABLE = getTableName();
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_TITLE, song.getTitle());
		values.put(KEY_AUTHOR, song.getAuthor());
		// values.put(KEY_RSS_LINK, site.getRSSLink());
		values.put(KEY_INFO, song.getInfo());
		values.put(KEY_IMAGE_URL, song.getImageUrl());
		values.put(KEY_SONG_URL, song.getSongURL());

		// updating row return
		int update = db.update(SONG_TABLE, values, KEY_SONG_URL + " = ?",
				new String[] { String.valueOf(song.getSongURL()) });
		db.close();
		return update;

	}

	/**
	 * Reading a row (website) row is identified by row id
	 * */
	public SongItem getSiteById(int id) {
		SONG_TABLE = getTableName();
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(SONG_TABLE, new String[] { KEY_ID, KEY_TITLE,
				KEY_SONG_URL, KEY_IMAGE_URL, KEY_INFO, KEY_AUTHOR },
				KEY_ID + "=?", new String[] { String.valueOf(id)}, null, null, null, null);
		if (cursor != null) {
			cursor.moveToFirst();
		}

		SongItem song = new SongItem(cursor.getString(1), cursor.getString(3),
				cursor.getString(5), cursor.getString(2), cursor.getString(4));

		song.setSongID(Integer.parseInt(cursor.getString(0)));
		cursor.close();
		db.close();
		return song;
	}

	/**
	 * Reading a row (website) row is identified by link
	 * */
	public SongItem getSongByLink(String link) {
		SONG_TABLE = getTableName();
		SQLiteDatabase db = this.getReadableDatabase();

		Cursor cursor = db.query(SONG_TABLE, new String[] { KEY_ID, KEY_TITLE,
				KEY_SONG_URL, KEY_IMAGE_URL, KEY_INFO, KEY_AUTHOR },
				KEY_SONG_URL + "=?", new String[] { link }, null, null, null, null);
		if (cursor != null) {
			cursor.moveToFirst();
		}
		SongItem song = new SongItem(cursor.getString(1), cursor.getString(3),
				cursor.getString(5), cursor.getString(2), cursor.getString(4));

		song.setSongID(Integer.parseInt(cursor.getString(0)));

		cursor.close();
		db.close();
		return song;
	}

	/**
	 * Deleting single row
	 * */
	public void deleteSong(SongItem song) {
		SONG_TABLE = getTableName();
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(SONG_TABLE, KEY_SONG_URL + " = ?",
				new String[] { String.valueOf(song.getSongURL()) });
		db.close();
	}

	/**
	 * Checking whether a site is already existed check is done by matching song url
	 * 
	 * */
	public boolean isSongExists(SQLiteDatabase db, String link) {
		SONG_TABLE = getTableName();
		Cursor cursor = db.rawQuery("SELECT * FROM " + SONG_TABLE
				+ " WHERE song_url = '" + link + "'", new String[] {});
		boolean exists = (cursor.getCount() > 0);
		return exists;
	}

	/**
	 * Get the size of the database
	 */
	public int getDatabaseSize() {
		SONG_TABLE = getTableName();
		String countQuery = "SELECT  * FROM " + SONG_TABLE;
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		int cnt = cursor.getCount();
		cursor.close();
		return cnt;
	}

	
	/**
	 * Set table name
	 */
	private String getTableName() {
		
		//StaticVariable.CATEGORY_TITLE.
		String table_name = null;
		//Log.d("DEBUG", "SQL CATE " + MainActivity.nameCategory);
		Set<SongCategory> keySet = StaticVariable.CATEGORY_TITLE.keySet();
		if (keySet != null){
			ArrayList<SongCategory> list = new ArrayList<SongCategory>(keySet);
			int position = list.indexOf(MainActivity.SongCategory);
			table_name = StaticVariable.TABLE_NAME_ARRAY.get(position);
		}
	
		return table_name;
	}

}
