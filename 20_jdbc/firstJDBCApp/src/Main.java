
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try{
            //Login and register the sql driver
        Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbclearning",user = "root",password = "root";

            //connecting to the database
            Connection connect = DriverManager.getConnection(url,user,password);

            //creating the statement
            Statement statement = connect.createStatement();

            //execute query
            String query = "INSERT INTO studentInfo(id,sname,sage,scity) VALUES(1,'Rohan',19,'Banglore')";
            int rowsAffected = statement.executeUpdate(query);
            //process the result
            if(rowsAffected == 0){
                System.out.println("Insert failed");
            }else{
                System.out.println("Insert successful");
            }
            //close the resources
            statement.close();
            connect.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}