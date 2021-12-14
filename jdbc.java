
import java.sql.*;
public class jdbc_update {
    Connection con;
    Statement s;
    public jdbc_update()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/lab 26/11","root","");
            s= con.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }




    }
    public void insert(int r,String n,int m,int pn,String bkm) {
        try


        {
            int a = s.executeUpdate("insert into lab 26/11 values(" + r + ",'" + n + "'," + m + "," + pn + ",'" + bkm + "')");
            if (a>0)
            {
                System.out.println("Record is added");

            }
            else
            {
                System.out.println("Problem in insertion");
            }
        } catch (SQLException e1){
            e1.getStackTrace();
        }
    }
    public static void main(String[] args) {
        jdbc_update d = new jdbc_update();
        d.insert(10,"kkk",89,963,"Rakesh Pal");

    }
}