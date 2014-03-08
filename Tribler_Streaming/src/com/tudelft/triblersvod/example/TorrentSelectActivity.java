package com.tudelft.triblersvod.example;

import java.util.List;

import org.videolan.vlc.gui.video.VideoPlayerActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.tudelft.triblersvod.example.R;

public class TorrentSelectActivity extends SherlockFragmentActivity {

	private final static String DEBUG_TAG = "TorrentSelectActivity";
	private int TORRENT_REQ_CODE;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_torrentselect);
		((TextView) findViewById(R.id.torrentselect_text)).setMovementMethod(LinkMovementMethod.getInstance());
		String path = cleanUriPath(getIntent().getDataString());
		if (!(path == null || path.equals("")))
			tryStartingTorrent(path);
	}
	
	@Override 
	protected void onResume() {
		super.onResume();
		if(findViewById(R.id.torrentselect_buttton).getVisibility() == View.GONE) {
			PackageManager manager = this.getPackageManager();
			Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
			intent.setType("file/*");
		    List<ResolveInfo> infos = manager.queryIntentActivities(intent, 0);
		    if (infos.size() > 0) {
	        	//set button
	        	findViewById(R.id.torrentselect_buttton).setVisibility(View.VISIBLE);
	        	TextView welcomeText = (TextView) findViewById(R.id.torrentselect_text);
	        	welcomeText.setText(R.string.intro_text);
	        }
		} else { //visible button
			PackageManager manager = this.getPackageManager();
			Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
			intent.setType("file/*");
		    List<ResolveInfo> infos = manager.queryIntentActivities(intent, 0);
		    if (infos.size() == 0) {
	        	//remove button
	        	findViewById(R.id.torrentselect_buttton).setVisibility(View.GONE);
	        	TextView welcomeText = (TextView) findViewById(R.id.torrentselect_text);
	        	welcomeText.setText(R.string.intro_text_no_file_explorer);
	        }
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getSupportMenuInflater();
	    inflater.inflate(R.menu.torrent_select, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent;
		 switch (item.getItemId()) {
	        case R.id.torrent_settings_menu:
	        	intent = new Intent(this, SetPreferenceActivity.class);
				startActivity(intent);
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
		 }
	}

	public void selectTorrent(View button) {
		Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
		intent.setType("file/*");
		startActivityForResult(intent, TORRENT_REQ_CODE);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode == Activity.RESULT_OK && requestCode == TORRENT_REQ_CODE) {
			String fileName = cleanUriPath(data.getDataString());
			tryStartingTorrent(fileName);
		}
	}

	private String cleanUriPath(String uri) {
		return uri == null ? "" : Uri.decode(uri);
	}

	private void tryStartingTorrent(String fileName) {
		Log.d(DEBUG_TAG, "Trying to start: " + fileName);
		if (fileName.endsWith(".torrent")) {
			startVideo(Uri.parse(fileName));
		} else
			Toast.makeText(this, "Error, filename did not end with '.torrent'",
					Toast.LENGTH_LONG).show();
	}
	
	public void openMagnetImage(View image) {
		switch (image.getId()) {
		case R.id.magnet_img_1:
			startVideo(Uri.parse(Uri.decode(getString(R.string.magnet1))));
			break;
		case R.id.magnet_img_2:
			startVideo(Uri.parse(Uri.decode(getString(R.string.magnet2))));
			break;
		case R.id.magnet_img_3:
			startVideo(Uri.parse(Uri.decode(getString(R.string.magnet3))));
			break;
		default:
			break;
		}
	}
	
	private void startVideo(Uri data) {
		Intent i = new Intent(this, VideoPlayerActivity.class);
		i.setAction(Intent.ACTION_VIEW);
		i.setData(data);
		startActivity(i);
	}
	
	public void magnetSearch(View v) {
		Uri uri = Uri.parse("http://www.google.nl/search?&q=best+magnet+links+site");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchBrowser);
	}
}
