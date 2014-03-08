package com.tudelft.triblersvod.example;

import com.tudelft.triblersvod.example.R;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class TorrentPreferences extends PreferenceFragment {
	public final static String NAME = "TorrentPreferences";
	public final static String KEY_LIBTORRENT_DEBUG = "libtorrent_debug";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.torrent_settings);
    }
}