package SuiSui.zz.controller;

import SuiSui.zz.dao.UserDao;
import SuiSui.zz.scence.FunctionScence;
import SuiSui.zz.scence.IndexScence;
//import SuiSui.zz.service.UserService;
//import SuiSui.zz.service.impl.UserServiceImpl;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.List;

public class LoginController {

    @FXML
    private TextField user_password;

    @FXML
    private Button login_button;

    @FXML
    private TextField user_name;

    @FXML
    private CheckBox remeber;

    @FXML
    void LoginClicked(MouseEvent event) {
//        UserService userService = new UserServiceImpl();
//        List<UserDao> userDaoList = userService.selectAll();
//        for(UserDao user : userDaoList)
//        {
//            if(user_name.getText().equals(user.getUser_name())&&user_password.getText().equals(user.getUser_password()))
//            {
//                IndexScence.getInstance().toFunction();
//            }
//        }
        if(user_name.getText().equals("admin")&&user_password.getText().equals("admin"))
        {
            IndexScence.getInstance().toFunction();
        }

    }

}
