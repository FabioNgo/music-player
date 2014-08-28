package ngo.music.player.getresource;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.RequestLine;
import org.apache.http.auth.AuthState;
import org.apache.http.client.HttpClient;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.io.AbstractSessionInputBuffer;
import org.apache.http.impl.io.HttpResponseParser;
import org.apache.http.message.BasicLineParser;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import com.soundcloud.api.ApiWrapper;
import com.soundcloud.api.Endpoints;
import com.soundcloud.api.Http;
import com.soundcloud.api.OAuth2HttpRequestInterceptor;
import com.soundcloud.api.OAuth2HttpRequestInterceptorTest;
import com.soundcloud.api.Request;
import com.soundcloud.api.Stream;
import com.soundcloud.api.Token;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.util.Log;

public class GetResourceSoundCloud extends AsyncTask<String, Integer, String> {
	
	private static final String CLIENT_SECRET = "0319e70c0e1edd9f3a9f74fdd59afa02";
	private static final String CLIENT_ID = "231a342b29415629a54c307479045eac";
	private static final String USERNAME = "luisngo";
	private static final String PASSWORD = "ngolebaoloc";
	private static final String REDIRECT_URL = "callback.html";
	//private static final String PLAYLISTS = null;
	public static final String TRACK_PERMALINK = "http://soundcloud.com/jberkel/nobody-home";
    public static final String MEDIA_LINK = "http://media.soundcloud.com/stream/zkwlN5MGNsJt";
    public static final long USER_ID      = 18173653L;
    public static final long CHE_FLUTE_TRACK_ID = 274334;
    public static final long FLICKERMOOD_TRACK_ID = 293;
    public static final long TRACK_LENGTH = 224861L;
	private BasicHttpContext context;
	private AuthState authState;
	private  OAuth2HttpRequestInterceptor interceptor;
	@Override
	protected void onPreExecute() {
	
	};
	
	@Override
	protected String doInBackground(String... params) {
	    // TODO Auto-generated method stub
	
	               // Call your web service here
	
		 /**
		  * Create Wrapper
		  */
		 final File wrapperFile = CreateWrapper.WRAPPER_SER;
		 final ApiWrapper wrapper = new ApiWrapper(
                 	CLIENT_ID /* client_id */,
                  CLIENT_SECRET /* client_secret */,
                  URI.create(REDIRECT_URL)   /* redirect URI */,
                  null    /* token */);
		 Log.d("DEBUG" ,"GET " + wrapper.toString());
         // Token token;
          //if (args.length < 6) {
           try {
        	
			Token token = wrapper.login(USERNAME /* login */, PASSWORD /* password */);
			//Log.d("DEBUG" ,"GET TOKEN " + token.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        //  } else {
             // token = wrapper.login(args[2] /* login */, args[3] /* password */, args[5] /* scope */);
         // }
          
		 //final ApiWrapper wrapper = ApiWrapper.fromFile(wrapperFile);
          final Request resource = Request.to("https://api.soundcloud.com/explore/sounds/category/rock");
        
          
          Log.d("DEBUG" ,"GET RESOURCE " + resource);
          try {
              //HttpResponse resp = wrapper.get(resource);
        	  HttpResponse resp = wrapper.get(Request.to("https://soundcloud.com/nuclearblastrecords"));
        	  long id = wrapper.resolve("https://soundcloud.com/nuclearblastrecords");
        	  Log.d("DEBUG", "ID " + String.valueOf(id));
        	 // Log.d("DEBUG", "JSON \n" + id);
//        	  Stream s1 = new Stream(
//                      "http://api.soundcloud.com",
//                      "https://soundcloud.com/mrsuicidesheep/summer-chords-pt-2-electro-house-mix",
//                      parse("s3-headers.txt"));
        	  MediaPlayer media = new MediaPlayer();
        	  media.setDataSource("http://api.soundcloud.com/tracks/13158665.json?client_id=231a342b29415629a54c307479045eac");
                      //.with("playlist[title]", "test playlist"));
              //resp.getFirstHeader(
              //HttpClient httpclient = new DefaultHttpClient();
              //Log.d("RESP", "GET RESP " + resp. );
              int status = resp.getStatusLine().getStatusCode();
              Log.d("DEBUG", "PLAY " + status);
             // resource.toUrl();
            //  Header location = resp.getFirstHeader("Location");
            //  resp.
        	  Header[] headers = resp.getAllHeaders();
        	  for (Header header : headers){
        		  Log.d("DEBUG", "PLAY NAME " + header.getName());
        		  Log.d("DEBUG", "PLAY VALUE " + header.getValue());
        		  Log.d("DEBUG", " a    " );
        	  }
              
             // Header[] headers = resp.getAllHeaders();
              //Log.d("DEBUG", "PLAY " + he);
              //String playlistUrl = location.getValue(); 
              
              String title = "LUIS NGO" + System.currentTimeMillis();
           //   Stream s = wrapper.resolveStreamUrl("https://api.soundcloud.com/explore/sounds/category/rock", false);
	             // resp = wrapper.put(Request.to("https://api.soundcloud.com/explore/sounds/category/rock")
	                //      .with("tracks", title));
	           
	             
             // JSONObject tobj = new JSONObject(EntityUtils.toString(resp.getEntity()));
              
          } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (HttpException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
		} finally{
          	try {
					wrapper.toFile(wrapperFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
          }
	    return null;
	}
	
	@Override
	protected void onPostExecute(String result) {
	    // TODO Auto-generated method stub
	
	    // Update your UI here
	    return;
}

    private HttpResponse parse(final String resource) throws IOException, HttpException {
        final HttpParams params = new BasicHttpParams();
        HttpResponseParser parser = new HttpResponseParser(new AbstractSessionInputBuffer() {
            {
                init(getClass().getResourceAsStream(resource), 8192, params);
            }

            @Override
            public boolean isDataAvailable(int timeout) throws IOException {
                return true;
            }
        }, new BasicLineParser(), new DefaultHttpResponseFactory(), params);

        return (HttpResponse) parser.parse();
    }
}


