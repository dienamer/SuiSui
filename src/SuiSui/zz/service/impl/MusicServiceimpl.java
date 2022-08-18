package SuiSui.zz.service.impl;

import SuiSui.zz.service.MusicService;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URL;

public class MusicServiceimpl implements MusicService {
    private MediaPlayer media;
    public MusicServiceimpl(MediaPlayer media){
        this.media=media;
    }
    @Override
    public void musicPlay(String song_name) {
        URL url = this.getClass().getClassLoader().getResource("resources/song/"+song_name+".mp3");
        Media music = new Media(url.toString());
        //this.media=new MediaPlayer();
    }

    @Override
    public void musicStop() {

    }

    @Override
    public void musicDel() {

    }

    @Override
    public void musicAdd() {

    }
}
