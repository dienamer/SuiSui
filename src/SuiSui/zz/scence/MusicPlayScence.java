package SuiSui.zz.scence;

import SuiSui.zz.dao.SongDao;
import SuiSui.zz.util.MusicPlayUtil;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Observable;

public class MusicPlayScence {
    private List<SongDao> songs;
    private  boolean staus=true;
    private MediaPlayer mediaPlayer;
    private Slider volume;
    private ListView<String> song_list;
    private Stage stage;
    private BorderPane root;
    private VBox left;
    private VBox right;
    private HBox down;
    private HBox top;
    private ImageView next_button;
    private ImageView pre_button;
    private ImageView pause_button;
    private ImageView list_button;
    public static MusicPlayScence musicPlayScence = new MusicPlayScence();
    public void init(Stage stage) throws IOException {
        this.stage=stage;
        ObservableList<String> observableList = FXCollections.observableArrayList();
        this.songs=new MusicPlayUtil().getSongList();
        for(SongDao song :songs)
        {
            observableList.add(song.getSong_name());
        }
        this.song_list = new ListView<String>(observableList);
        FlowPane flowPane = new FlowPane(this.song_list);
        flowPane.setAlignment(Pos.CENTER);
        this.root=new BorderPane();
        root.setCenter(flowPane);
        this.right=new VBox();
        this.top=new HBox();
        this.left=new VBox();
        this.down=new HBox();
        this.volume=new Slider(0,1,0.2);
        this.next_button=new ImageView(new Image(new FileInputStream("resources/image/icon/musicplay/right_up.png")));
        this.pre_button=new ImageView(new Image(new FileInputStream("resources/image/icon/musicplay/left_up.png")));
        this.pause_button=new ImageView(new Image(new FileInputStream("resources/image/icon/musicplay/play_up.png")));
        this.list_button=new ImageView(new Image(new FileInputStream("resources/image/icon/musicplay/list_up.png")));
        this.pause_button.setPickOnBounds(true);
        this.down.getChildren().addAll(pre_button,pause_button,next_button,list_button,volume);
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
        this.down.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8FBC8F"),new CornerRadii(20),new Insets(10))));
        this.down.setOpacity(0.4);
        //song_list
        this.song_list.setPrefHeight(100);
        this.song_list.setPrefWidth(100);
        this.song_list.setOpacity(0.4);
        this.song_list.setStyle("-fx-background-insets: 0;");

        //next_button
        this.next_button.setFitHeight(50);
        this.next_button.setFitWidth(50);
        //pre_button
        this.pre_button.setFitHeight(50);
        this.pre_button.setFitWidth(50);
        //pause_button
        this.pause_button.setFitHeight(50);
        this.pause_button.setFitWidth(50);
        //list_button
        this.list_button.setFitHeight(50);
        this.list_button.setFitWidth(50);
        this.list_button.setPickOnBounds(true);
        //volume
        this.volume.setPrefWidth(100);
        //root
        //stage

    }
    private void setAction()
    {

        list_button.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    list_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/list_down.png")));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        list_button.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    list_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/list_up.png")));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        pre_button.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    pre_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/left_down.png")));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        pre_button.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    pre_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/left_up.png")));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        next_button.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    next_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/right_down.png")));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        next_button.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    next_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/right_up.png")));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        pause_button.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                    try {
                        if(staus)
                        {
                            pause_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/play_down.png")));
                        }
                        else {
                            pause_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/stop_down.png")));
                        }

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }


            }
        });
        pause_button.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                    try {
                        if(staus) {

                            pause_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/play_up.png")));
                        }
                        else {
                            pause_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/stop_up.png")));
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }


        });
        pause_button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    if(staus)
                    {
                        pause_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/stop_up.png")));
                        staus=false;
                        mediaPlayer.play();
                    }
                    else {
                        pause_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/play_up.png")));
                        mediaPlayer.pause();
                        staus=true;
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        song_list.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getClickCount()==2) {
                    int index = song_list.getSelectionModel().getSelectedIndex();
                    URL url =getClass().getClassLoader().getResource("song/1.mp3");
                    Media music = new Media(url.toExternalForm());
                    mediaPlayer=new MediaPlayer(music);
                    mediaPlayer.setOnReady(new Runnable() {
                        @Override
                        public void run() {

                            mediaPlayer.volumeProperty().bind(volume.valueProperty());
                            mediaPlayer.play();
                            staus=false;
                            try {
                                pause_button.setImage(new Image(new FileInputStream("resources/image/icon/musicplay/stop_up.png")));
                            } catch (FileNotFoundException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    });

                }
            }
        });
    }

}
