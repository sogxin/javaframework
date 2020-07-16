package practice;

import java.sql.*;

public class mysql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");//导入驱动（jar包）
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "123456");//建立连接
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql = "select name,email,dob from ssm";//建立SQL语句
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
//cursor
            while(rs.next()){
                String name = rs.getString(1);
                String email = rs.getString(2);
                String dob = rs.getString(3);
                System.out.println(name+" , "+email+" , "+dob);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(conn!=null)
                try {
                    conn.close();//关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }
}

