package SuiSui.zz.scence;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class FunctionScence {
    public static void load(Stage stage)
    {

        try {
            Parent root = FXMLLoader.load(LoginScence.class.getResource("/fxml/function.fxml"));
            stage.setHeight(600);
            stage.setWidth(600);
            stage.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
