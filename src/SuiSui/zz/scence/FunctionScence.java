package SuiSui.zz.scence;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FunctionScence {
    private Stage stage;
    private Button music;
    private Button chat;
    public static FunctionScence functionScence = new FunctionScence();

    public void init(Stage stage) {
        this.stage = stage;
        this.music = new Button("播放器");
        this.chat = new Button("聊天室");
        FlowPane pane = new FlowPane();
        pane.getChildren().addAll(music, chat);
        Scene scene = new Scene(pane);
        this.stage.setScene(scene);
        setAction();
        this.stage.show();
    }

    private  class Controller implements EventHandler<javafx.event.ActionEvent> {


        @Override
        public void handle(ActionEvent event) {
            try {
                MusicPlayScence.musicPlayScence.init(stage);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void setAction(){
        this.music.setOnAction(new Controller());
    }
}
