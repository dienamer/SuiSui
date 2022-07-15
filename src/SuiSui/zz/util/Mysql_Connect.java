//package SuiSui.zz.util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Mysql_Connect {
//     private  static Statement stmt;
//     static {
//         try {
//             Class.forName("com.mysql.jdbc.Driver");
//             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/suisui?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","root");
//             stmt = conn.createStatement();
//         } catch (ClassNotFoundException e) {
//             e.printStackTrace();
//         } catch (SQLException throwables) {
//             throwables.printStackTrace();
//         }
//     }
//
//    public static Statement getStmt() {
//        return stmt;
//    }
//
//
//}
