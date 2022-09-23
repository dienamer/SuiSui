package SuiSui.zz.scence;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

public class LoginScence {


    private VBox vBox = new VBox();
    private AnchorPane pane = new AnchorPane();
    //控件
    private Label label1 = new Label("用户名");
    private Label label2 = new Label("密   码");
    private TextField user_name = new TextField();
    private Button login_button = new Button("登录");
    private PasswordField user_password = new PasswordField();
    private CheckBox remeber = new CheckBox("记住密码");

    private HBox hBox1 = new HBox();
    private HBox hBox2 = new HBox();
    private HBox hBox3 = new HBox();

    private static LoginScence loginScence = new LoginScence();
    private Stage stage;

    public void init(Stage stage)
    {

        this.stage=stage;
        this.pane.setPrefHeight(600);
        this.pane.setPrefWidth(600);
        hBox1.getChildren().addAll(label1,this.user_name);
        hBox2.getChildren().addAll(label2,user_password);
        hBox3.getChildren().addAll(login_button,remeber);
        hBox1.setSpacing(10);
        hBox2.setSpacing(10);
        hBox3.setSpacing(10);
        vBox.getChildren().addAll(hBox1,hBox2,hBox3);
        vBox.setSpacing(15);
        vBox.setLayoutX(250);
        vBox.setLayoutY(250);
        vBox.setPrefHeight(300);
        vBox.setPrefWidth(250);
        pane.getChildren().add(vBox);
        setStyle();
        setAction();
        Scene scene = new Scene(pane);
        stage.setScene(scene);


    }
    private void setStyle()
    {
        this.pane.setStyle("-fx-background-image: url(image/background.jpg);" +
                           "-fx-background-size: 100%"
        );
        this.user_name.setStyle("-fx-opacity: 0.4");
        this.user_password.setStyle("-fx-opacity: 0.4");

    }
    private void setAction()
    {
        this.login_button.setOnAction(new Controller());
    }
    public static  LoginScence getLoginScence()
    {
        return loginScence;
    }
    private  class Controller implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            if(remeber.isSelected())
            {
                File file = new File("resources/user.txt");
                try {
                    OutputStreamWriter write = new FileWriter(file);
                    write.write(user_name.getText()+"\n");
                    write.write(user_password.getText()+"\n");
                    write.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if(user_name.getText().equals("admin")&&user_password.getText().equals("admin"))
            {
                FunctionScence.functionScence.init(stage);

            }
        }
    }


}
