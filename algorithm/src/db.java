import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class db {
    private ResultSet resul, result1;
    private Connection con;
    String  conect(int a) throws ClassNotFoundException {
        String us="root";
        String ps="";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/test",us,ps);
            PreparedStatement pst=con.prepareStatement("select fail_course FROM course where Id=?");
            pst.setInt(1,a);
            resul=pst.executeQuery();
            resul.next();
                String failcourse=resul.getNString("fail_course");
                System.out.println(failcourse);
                return failcourse;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
