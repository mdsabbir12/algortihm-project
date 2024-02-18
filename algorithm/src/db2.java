import java.sql.*;

public class db2 {
    private ResultSet resul, result1;
    private Connection con;
    String  conect(int a) throws ClassNotFoundException {
        String us="root";
        String ps="";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/test",us,ps);
            PreparedStatement pst1=con.prepareStatement("select Courses FROM all_node where node=?");
            pst1.setInt(1,a);
            result1=pst1.executeQuery();
            result1.next();
            String allcourse=result1.getNString("Courses");
            System.out.println(allcourse);
            return allcourse;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
