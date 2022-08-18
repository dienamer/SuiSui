package SuiSui.zz.dao;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.media.MediaPlayer;

public class SongDao {

    private String song_name;
    private String song_path;
    private String song_singer_name;

    public SongDao(String song_name, String song_path, String song_singer_name) {
        this.song_name = song_name;
        this.song_path = song_path;
        this.song_singer_name = song_singer_name;
    }





    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getSong_path() {
        return song_path;
    }

    public void setSong_path(String song_path) {
        this.song_path = song_path;
    }

    public String getSong_singer_name() {
        return song_singer_name;
    }

    public void setSong_singer_name(String song_singer_name) {
        this.song_singer_name = song_singer_name;
    }
}
