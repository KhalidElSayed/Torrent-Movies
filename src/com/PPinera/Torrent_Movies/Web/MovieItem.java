package com.PPinera.Torrent_Movies.Web;

import org.json.JSONObject;


public class MovieItem {
    private MovieInformationHandler handler;

    private String imdbCode;
    private boolean state;
    private String imdbLink;
    private String uploader;
    private long uploaderUID;
    private String dateAdded;
    private String movieTitleClean;
    private long movieId;
    private String movieTitle;
    private String movieCover;
    private String movieMiniCover;
    private float movieRating;
    private String movieUrl;
    private String movieYear;
    private String quality;
    private long sizeByte;
    private String genre;
    private int downloaded;
    private int torrentSeeds;
    private int torrentPeers;
    private String torrentUrl;
    private String torrentHash;
    private String torrentMagnetUrl;
    private int movieRuntime;
    private String longDescription;
    private String shortDescription;
    private String language;
    private String youtubeTrailer;
    private String ageRating;

    /**
     * Constructors
     */

    public MovieItem(JSONObject object, MovieInformationHandler handler ){
        super();
        setValuesFromJsonObject(object);
        this.handler = handler;
    }


    public void setValuesFromJsonObject(JSONObject object){
        try{ this.movieId = object.getLong("MovieID"); }catch (Exception e){}
        try{this.state = object.getString("State").equals("OK");}catch (Exception e){}
        try{ this.movieUrl = object.getString("MovieUrl"); }catch (Exception e){}
        try{ this.movieTitle = object.getString("MovieTitle"); }catch (Exception e){}
        try{ this.movieTitleClean = object.getString("MovieTitleClean"); }catch (Exception e){}
        try{ this.movieYear = object.getString("MovieYear"); }catch (Exception e){}
        try{ this.dateAdded = object.getString("DateUploaded"); }catch (Exception e){}
        try{ this.quality = object.getString("Quality"); }catch (Exception e){}
        try{ this.imdbCode = object.getString("ImdbCode"); }catch (Exception e){}
        try{ this.imdbLink = object.getString("ImdbLink"); }catch (Exception e){}
        try{ this.sizeByte = object.getLong("SizeByte"); }catch (Exception e){}
        try{ this.movieRating = object.getLong("MovieRating"); }catch (Exception e){}
        try{ this.genre = object.getString("Genre"); }catch (Exception e){}
        try{ this.uploader = object.getString("Uploader"); }catch (Exception e){}
        try{ this.uploaderUID = object.getLong("UploaderUID"); }catch (Exception e){}
        try{ this.torrentSeeds = object.getInt("TorrentSeeds"); }catch (Exception e){}
        try{ this.torrentPeers = object.getInt("TorrentPeers"); }catch (Exception e){}
        try{ this.torrentUrl = object.getString("TorrentUrl"); }catch (Exception e){}
        try{ this.torrentHash = object.getString("TorrentHash"); }catch (Exception e){}
        try{ this.torrentMagnetUrl = object.getString("TorrentMagnetUrl"); }catch (Exception e){}
        try{ this.language = object.getString("Language"); }catch (Exception e){}
        try{ this.movieCover = object.getString("LargeCover"); }catch (Exception e){}
        try{ this.movieMiniCover = object.getString("MediumCover"); }catch (Exception e){}
        try{ this.movieRuntime = object.getInt("MovieRuntime"); }catch (Exception e){}
        try{ this.youtubeTrailer = object.getString("YoutubeTrailerUrl"); }catch (Exception e){}
        try{ this.ageRating = object.getString("AgeRating"); }catch (Exception e){}
        try{ this.shortDescription = object.getString("ShortDescription"); }catch (Exception e){}
        try{ this.longDescription = object.getString("LongDescription"); }catch (Exception e){}
        try{ this.downloaded = object.getInt("Downloaded"); }catch (Exception e){}

        notifyInfoChanged();
    }

    private void notifyInfoChanged(){
        if (handler!= null) handler.movieInfoChanged();
    }

    /**
     * Setters
     */
    public void setMovieInformationHandler(MovieInformationHandler handler){
        this.handler = handler;
    }

    /**
     * Getters
     */

    public long getMovieId(){
        return this.movieId;
    }

    public String getMovieCover(){
        return this.movieCover;
    }
    public String getMovieMiniCover(){
        return this.movieMiniCover;
    }

    /**
     * Interface
     */
    public interface MovieInformationHandler {
        public void movieInfoChanged();
    }

}
