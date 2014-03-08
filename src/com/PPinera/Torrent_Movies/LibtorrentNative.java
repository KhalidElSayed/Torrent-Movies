package com.PPinera.Torrent_Movies;

public class LibtorrentNative {
    static {
        System.loadLibrary("libtorrent");
    }

    public native int add( int v1, int v2 );

    public native String hello();
}
