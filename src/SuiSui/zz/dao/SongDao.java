package SuiSui.zz.dao;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.media.MediaPlayer;

public class SongDao {

    private String song_name;
    private String song_number;
    //private String song_singer_name;
    //private  int   song_long_time;


    public SongDao(String song_name, String song_number) {
        this.song_name = song_name;
        this.song_number = song_number;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getSong_number() {
        return song_number;
    }

    public void setSong_number(String song_number) {
        this.song_number = song_number;
    }
}
