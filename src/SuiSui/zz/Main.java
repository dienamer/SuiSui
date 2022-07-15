package SuiSui.zz;

import SuiSui.zz.scence.IndexScence;
//import SuiSui.zz.util.Mysql_Connect;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
//        Mysql_Connect mysql_connect = new Mysql_Connect();
        Application.launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        IndexScence.getInstance().init(primaryStage);
    }
}
