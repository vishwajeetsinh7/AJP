import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ajp1student {

    public static void main(String[] args) {

        try{

//            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/vish";
            String username = "root";
            String password = "password";

            Connection con = DriverManager.getConnection(url, username, password);

            if(con.isClosed()){
                System.out.println("connection is closed");
            }else{
                System.out.println("connection is created");
            }


            String query = "insert into student values(?,?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "viswsfds");
            ps.setString(2 ,"1");

            int i = ps.executeUpdate();
            System.out.println("row updated" + i);

            ps.close();
            con.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }

}