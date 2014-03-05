package com.PPinera.Torrent_Movies.Web;

import android.graphics.Movie;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.HashMap;

public class YIFIClient {
    private static final String YIFI_API_URL = "https://yts.re/api/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    private static String getAbsoluteUrl(String relativeUrl) {
        StringBuilder urlBuilder = new StringBuilder(YIFI_API_URL);
        urlBuilder.append(relativeUrl);
        return urlBuilder.toString();
    }

    public static void getFilmsByGenre(final filmsListHandler handler, String genre){
        if(handler == null) return;
        RequestParams params= new RequestParams();
        params.add("limit","50");
        params.add("genre",genre);
        params.add("sort","seeds");
        params.add("order","asc");
        String absoluteURL = getAbsoluteUrl("list.json");
        client.get(absoluteURL, params, new AsyncHttpResponseHandler() {
            public void onSuccess(int statusCode, java.lang.String content) {
                try {
                    final ArrayList<MovieItem> films = new ArrayList<MovieItem>();
                    JSONObject filmsContent = new JSONObject(content);
                    JSONArray filmsArray = filmsContent.getJSONArray("MovieList");
                    for (int i = 0; i < filmsArray.length(); i++) {
                        final MovieItem newFilm = new MovieItem(filmsArray.getJSONObject(i),null);
                        getExtraFilmDetails(newFilm);
                        films.add(newFilm);
                    }
                    handler.onSuccessFilms(films);
                } catch (Exception e) {
                    handler.onErrorFilms(e);
                }
            }

            private void getExtraFilmDetails(final MovieItem newFilm) {
                getFilmDetails(new filmDetailHandler() {
                    @Override
                    public void onSuccessFilmDetail(JSONObject film) {
                       newFilm.setValuesFromJsonObject(film);
                    }
                    @Override
                    public void onErrorFilmDetail(Throwable e) {
                    }
                },newFilm.getMovieId());
            }

            public void onFailure(int statusCode, org.apache.http.Header[] headers, byte[] responseBody, java.lang.Throwable error) {
                handler.onErrorFilms(error);
            }
        });
    }

    public static void getFilmDetails(final filmDetailHandler handler, long movieId){
        if(handler == null) return;
        RequestParams params= new RequestParams();
        params.add("id",new String(Long.toString(movieId)));
        String absoluteURL = getAbsoluteUrl("movie.json");
        client.get(absoluteURL, params, new AsyncHttpResponseHandler() {
            public void onSuccess(int statusCode, java.lang.String content) {
                try {
                    handler.onSuccessFilmDetail(new JSONObject(content));
                } catch (Exception e) {
                    handler.onErrorFilmDetail(e);
                }
            }
            public void onFailure(int statusCode, org.apache.http.Header[] headers, byte[] responseBody, java.lang.Throwable error) {
                handler.onErrorFilmDetail(error);
            }
        });
    }


    /**
     * Interfaces
     */

    public interface filmsListHandler{
        public void onSuccessFilms(ArrayList<MovieItem> films);
        public void onErrorFilms(java.lang.Throwable e);
    }

    public interface filmDetailHandler{
        public void onSuccessFilmDetail(JSONObject film);
        public void onErrorFilmDetail(java.lang.Throwable e);
    }
}
