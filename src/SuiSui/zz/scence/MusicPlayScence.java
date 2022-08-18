package SuiSui.zz.scence;

import SuiSui.zz.dao.SongDao;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Observable;

public class MusicPlayScence {
    private  boolean staus=true;
    private MediaPlayer mediaPlayer;
    private TableView song_list;
    private Stage stage;
    private BorderPane root;
    private VBox left;
    private VBox right;
    private HBox down;
    private HBox top;
    private ImageView next_button;
    private ImageView pre_button;
    private ImageView pause_button;
    private ImageView stop_button;
    public static MusicPlayScence musicPlayScence = new MusicPlayScence();
    public void init(Stage stage) throws FileNotFoundException {
        this.stage=stage;
        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.add("空我");
        ListView<String> listView = new ListView<String>(observableList);
        //listView.setOpacity(0.4);
        listView.setPrefHeight(100);
        listView.setPrefWidth(100);
        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getClickCount()==2) {
                    int index = listView.getSelectionModel().getSelectedIndex();
                    System.out.println(listView.getSelectionModel().getSelectedItem());
                    URL url =getClass().getClassLoader().getResource("song/1.mp3");
                    Media music = new Media(url.toExternalForm());
                    mediaPlayer=new MediaPlayer(music);
                    mediaPlayer.play();
                }
            }
        });
        FlowPane flowPane = new FlowPane(listView);
        flowPane.setAlignment(Pos.CENTER);
        this.root=new BorderPane();
        root.setCenter(flowPane);
        this.right=new VBox();
        this.top=new HBox();
        this.left=new VBox();
        this.down=new HBox();
        this.next_button=new ImageView(new Image(new FileInputStream("resources/image/icon/musicplay/next-button.png")));
        this.pre_button=new ImageView(new Image(new FileInputStream("resources/image/icon/musicplay/previous-track.png")));
        this.pause_button=new ImageView(new Image(new FileInputStream("resources/image/icon/musicplay/pause-button.png")));
        this.pause_button.setPickOnBounds(true);
        this.down.getChildren().addAll(pre_button,pause_button,next_button);
        this.down.setAlignment(Pos.CENTER);
        this.down.setSpacing(10);
        this.root.setRight(right);
        this.root.setLeft(left);
        this.root.setTop(top);
        this.root.setBottom(down);
        this.setAction();
        this.setDrow();
        this.setStyle();
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
        this.stage.show();

    }
    private  void setStyle()
    {
        this.root.setStyle("-fx-background-image: url(image/music.jpg);" + "-fx-background-size: 100%;"+"-fx-opacity: 1");
    }
    private void setDrow()
    {
        //stage
        this.stage.setHeight(550);
        this.stage.setWidth(1000);
        //right VBox
        this.right.setPrefWidth(100);
        this.right.setPrefHeight(100);
        //top Hbox
        this.top.setPrefWidth(100);
        this.top.setPrefHeight(100);
        //left VBox
        this.left.setPrefWidth(100);
        this.left.setPrefHeight(100);
        //down HBox
        this.down.setPrefWidth(100);
        this.down.setPrefHeight(100);
        //next_button
        this.next_button.setFitHeight(50);
        this.next_button.setFitWidth(50);
        //pre_button
        this.pre_button.setFitHeight(50);
        this.pre_button.setFitWidth(50);
        //pause_button
        this.pause_button.setFitHeight(50);
        this.pause_button.setFitWidth(50);
        //root
        //stage

    }
    private void setAction()
    {
         pause_button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("okkkk");
                try {
                    if(staus)
                    {
                        pause_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/stop-button.png")));
                        staus=false;
                    }
                    else {
                        pause_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/pause-button.png")));
                        mediaPlayer.stop();
                        staus=true;
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
