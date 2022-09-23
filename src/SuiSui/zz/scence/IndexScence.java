package SuiSui.zz.scence;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class IndexScence {

    Button loginButton;
    AnchorPane pane;
    Scene scene;
    private Stage stage;
    private static  IndexScence instance = new IndexScence();
    public static IndexScence getInstance() {
        return instance;
    }

    private class IndexController implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            Button button = (Button) event.getSource();
            if( button.getText().equals("登录"))
            {
                LoginScence.getLoginScence().init(stage);

            }
        }
    }
    public void init(Stage stage)
    {
        //Application.setUserAgentStylesheet(getClass().getResource("/css/Index.css").toExternalForm());
        this.stage=stage;

        loginButton = new Button("登录");
        loginButton.setLayoutX(250);
        loginButton.setLayoutY(400);
        loginButton.setPrefWidth(40);
        loginButton.setPrefHeight(30);

        pane = new AnchorPane();
        pane.setStyle("-fx-background-image: url(image/background.jpg);" +
                        "-fx-background-size: 100%");
        pane.getChildren().addAll(loginButton);

        scene = new Scene(pane);
        stage.setTitle("登录界面");
        stage.setScene(scene);
        stage.setResizable(false);

        this.stage.setWidth(600);
        this.stage.setHeight(600);
        this.stage.show();



        loginButton.setOnAction(new IndexController());
    }


}
