import java.sql.*;


public class DBConn {
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost/booklibrary";
  static final String USER = "root";
  static final String PASS = "";

  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try{
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
    }catch(SQLException se){
      //Handle errors for JDBC
      System.out.println("JDBC error");
      se.printStackTrace();
    }catch(Exception e){
      //Handle errors for Class.forName
      System.out.println("Class error");
      e.printStackTrace();
    }
    System.out.println("success");
  }
}
