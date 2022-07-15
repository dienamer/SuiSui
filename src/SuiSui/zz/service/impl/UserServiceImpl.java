//package SuiSui.zz.service.impl;
//
//import SuiSui.zz.dao.UserDao;
//import SuiSui.zz.service.UserService;
//import SuiSui.zz.util.Mysql_Connect;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserServiceImpl implements UserService {
//    private Statement stmt = Mysql_Connect.getStmt();
//    @Override
//    public List<UserDao> selectAll()  {
//        List<UserDao> userDaoList = new ArrayList<>();
//        UserDao userDao = new UserDao();
//        String sql = "select * from users";
//        try {
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next())
//            {
//                userDao.setUser_id(rs.getInt("user_id"));
//                userDao.setUser_name(rs.getString("user_name"));
//                userDao.setUser_password(rs.getString("user_password"));
//                userDaoList.add(userDao);
//            }
//            System.out.println(userDaoList);
//            return userDaoList;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    @Override
//    public UserDao selectOne(int user_id) {
//        return null;
//    }
//
//    @Override
//    public boolean update(int user_id) {
//        return false;
//    }
//
//    @Override
//    public boolean delete(int user_id) {
//        return false;
//    }
//}
