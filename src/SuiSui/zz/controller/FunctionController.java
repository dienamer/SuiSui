package SuiSui.zz.controller;



import SuiSui.zz.scence.IndexScence;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;

public class FunctionController {

    @FXML
    private Button ListenSong;

    @FXML
    private Button Comminicate;

    @FXML
    private ImageView Person;
    @FXML
    void musicPlay(MouseEvent event) {
        Stage stage = new Stage();
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(stage);
        try {
            Media media = new Media(file.toURL().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setOnReady(()->{
                mediaPlayer.setAutoPlay(true);
            });
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
    public void setListenSong(Button listenSong) {
        ListenSong = listenSong;
    }

    public void setComminicate(Button comminicate) {
        Comminicate = comminicate;

    }

    public void setPerson(ImageView person) {
        Person = person;
    }

    public Button getListenSong() {
        return ListenSong;
    }

    public Button getComminicate() {
        return Comminicate;
    }

    public ImageView getPerson() {
        return Person;
    }
}
