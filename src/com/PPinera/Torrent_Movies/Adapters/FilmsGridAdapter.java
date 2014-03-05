package com.PPinera.Torrent_Movies.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.PPinera.Torrent_Movies.R;
import com.PPinera.Torrent_Movies.Web.MovieItem;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

public class FilmsGridAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<MovieItem> movies;

    public FilmsGridAdapter(Context c, ArrayList<MovieItem> movies) {
        this.movies = new ArrayList<MovieItem>();
        this.context = c;
        this.movies = movies;
    }

    public int getCount() {
        return movies.size();
    }

    public Object getItem(int position) {
        return movies.get(position);
    }

    public long getItemId(int position) {
        return movies.get(position).getMovieId();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(0, 0, 0, 0);
        } else {
            imageView = (ImageView) convertView;
        }
        if(movies.get(position).getMovieCover()!= null){
            ImageLoader.getInstance().displayImage(movies.get(position).getMovieCover(), imageView);
        }else{
            imageView.setImageBitmap(null);
            imageView.setBackgroundColor(android.R.color.holo_red_dark);
        }
        return imageView;
    }
}
