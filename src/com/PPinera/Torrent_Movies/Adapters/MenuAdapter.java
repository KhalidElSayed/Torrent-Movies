package com.PPinera.Torrent_Movies.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.PPinera.Torrent_Movies.R;

public class MenuAdapter extends BaseAdapter {
    private static String[] MOVIES_GENRES;
    private Context context;

    public MenuAdapter(Context context){
        super();
        this.context = context;
    }

    @Override
    public int getCount() {
        return getMoviesGenres().length;
    }

    @Override
    public String getItem(int i) {
        return getMoviesGenres()[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        String genre = getItem(i);

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.menu_genre_row, null);
        }
        TextView tvName = (TextView) view.findViewById(R.id.genre_title);
        tvName.setText(genre);
        return view;
    }

    public String[] getMoviesGenres(){
        if(MOVIES_GENRES == null){
            MOVIES_GENRES = new String[24];
            MOVIES_GENRES[0] = "Popular";
            MOVIES_GENRES[1] = "Action";
            MOVIES_GENRES[2] = "Adventure";
            MOVIES_GENRES[3] = "Animation";
            MOVIES_GENRES[4] = "Biography";
            MOVIES_GENRES[5] = "Comedy";
            MOVIES_GENRES[6] = "Crime";
            MOVIES_GENRES[7] = "Documentary";
            MOVIES_GENRES[8] = "Drama";
            MOVIES_GENRES[9] = "Family";
            MOVIES_GENRES[10] = "Fantasy";
            MOVIES_GENRES[11] = "Film-Noir";
            MOVIES_GENRES[12] = "History";
            MOVIES_GENRES[13] = "Horror";
            MOVIES_GENRES[14] = "Music";
            MOVIES_GENRES[15] = "Musical";
            MOVIES_GENRES[16] = "Mistery";
            MOVIES_GENRES[17] = "Romance";
            MOVIES_GENRES[18] = "Sci-Fi";
            MOVIES_GENRES[19] = "Short";
            MOVIES_GENRES[20] = "Sport";
            MOVIES_GENRES[21] = "Thriller";
            MOVIES_GENRES[22] = "War";
            MOVIES_GENRES[23] = "Western";
        }
        return MOVIES_GENRES;
    }
}
