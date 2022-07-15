package SuiSui.zz.scence;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class IndexScence {
    private double width,higth;
    private double x,y;
    private Stage stage;
    private static  IndexScence instance = new IndexScence();
    public static IndexScence getInstance() {
        return instance;
    }

//    AnchorPane root = new AnchorPane();
//    Scene scene = new Scene(root , WIDTH, HEIGHT);
//        stage.setTitle("坦克");
//        stage.getIcons().add(new Image("image/logo.png"));
//        stage.setResizable(false);
//        stage.setScene(scene);
//        stage.setWidth(WIDTH);
//        stage.setHeight(HEIGHT);
//        this.stage = stage;
//    toIndex();
//        stage.show();
    public void init(Stage stage)
    {
        Button loginButton = new Button("登录");
        loginButton.setLayoutX(250);
        loginButton.setLayoutY(400);
        loginButton.setPrefWidth(40);
        loginButton.setPrefHeight(30);
        loginButton.setOnAction(event -> {
            toLogin();
        });
        AnchorPane root = new AnchorPane();
        root.getChildren().add(loginButton);
        Scene scene = new Scene(root , width, higth);
        stage.setTitle("登录界面");
        this.x=250;
        this.y=250;
        this.width=960;
        this.higth=480;
        this.stage=stage;
        stage.setScene(scene);
        this.stage.setWidth(width);
        this.stage.setHeight(higth);
        this.stage.show();
    }
    public void toLogin()
    {
        this.init(this.stage);
        LoginScence.load(stage);
    }
    public void toFunction()
    {
        this.init(this.stage);
        FunctionScence.load(stage);
    }
    public void toMusicPlay()
    {
        this.init(this.stage);
        MusicPlayScence.load(stage);
    }

}
