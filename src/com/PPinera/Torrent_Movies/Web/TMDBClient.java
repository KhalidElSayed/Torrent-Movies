package com.PPinera.Torrent_Movies.Web;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class TMDBClient {
    private static final String TMDB_API_URL = "https://api.themoviedb.org/3/";
    private static final String TMDB_API_KEY = "d9b8d3bbbe8b2ae7072eb53c0d26cbfd";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return TMDB_API_URL + relativeUrl;
    }

    //TODO - Implement TMDB client
    // http://docs.themoviedb.apiary.io/#genres
    // http://loopj.com/android-async-http/
}
