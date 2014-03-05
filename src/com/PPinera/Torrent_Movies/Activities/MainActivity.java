package com.PPinera.Torrent_Movies.Activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.PPinera.Torrent_Movies.Adapters.FilmsGridAdapter;
import com.PPinera.Torrent_Movies.Adapters.MenuAdapter;
import com.PPinera.Torrent_Movies.R;
import com.PPinera.Torrent_Movies.Web.MovieItem;
import com.PPinera.Torrent_Movies.Web.YIFIClient;

import java.util.ArrayList;


public class MainActivity extends Activity {
    private DrawerLayout drawerLayout;
    private ListView drawerList;
    private ActionBarDrawerToggle drawerToggle;
    private GridView gridview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setupDrawerLayout();
        setupActionBar();
        gridview = (GridView) findViewById(R.id.gridview);
    }

    private void reloadGridWithGenre(String genre){
        YIFIClient.getFilmsByGenre(new YIFIClient.filmsListHandler() {
            @Override
            public void onSuccessFilms(ArrayList<MovieItem> films) {
                FilmsGridAdapter adapter = new FilmsGridAdapter(MainActivity.this,films);
                gridview.setAdapter(adapter);
            }

            @Override
            public void onErrorFilms(Throwable e) {

            }
        },genre);
    }

    private void setupDrawerLayout() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerList = (ListView) findViewById(R.id.left_drawer);
        drawerList.setAdapter(new MenuAdapter(this));
        drawerList.setOnItemClickListener(new DrawerItemClickListener());
        drawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                drawerLayout,         /* DrawerLayout object */
                R.drawable.ic_drawer,  /* nav drawer icon to replace 'Up' caret */
                R.string.drawer_open,  /* "open drawer" description */
                R.string.drawer_close  /* "close drawer" description */
        ) {

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
            }

            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        drawerLayout.setDrawerListener(drawerToggle);
    }

    private void setupActionBar() {
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
    }


    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            selectItem(position);
            gridview.setAdapter(null);
            getActionBar().setTitle((String)parent.getItemAtPosition(position));
            reloadGridWithGenre((String)parent.getItemAtPosition(position));
        }
    }

    private void selectItem(int position) {
        drawerList.setItemChecked(position, true);
        drawerLayout.closeDrawer(drawerList);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
