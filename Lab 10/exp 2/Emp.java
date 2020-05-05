
import java.sql.*;

public class Emp {
  
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/sakila";

   static final String USER = "root";
   static final String PASS = "123456";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{

      Class.forName("com.mysql.jdbc.Driver");

  
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO Employees " + "VALUES (20, 52 ,'Pawan', 'Singh' )";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Employees " +  "VALUES (25, 20 , 'Anurag', 'Mor' )";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Employees " + "VALUES (35, 49 ,'Krishana', 'Devi' )";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Employees " + "VALUES(44, 27, 'Deepika', 'Malik', )";
      stmt.executeUpdate(sql);
      
      System.out.println("Inserted records into the table...");
      String sql1 = "SELECT id, first, last, age FROM Employees";
      ResultSet rs = stmt.executeQuery(sql1);
      
      while(rs.next()){
      
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

   
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }
      rs.close();
      
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Goodbye!");
}
}