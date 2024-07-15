package Project;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
     public Connection con=getConnection();    
            //API:DBMS//Server:####/DBName
    String url = "jdbc:postgresql://localhost:5432/ZardApartment";
    String username="postgres";
    String password="postgre";
/******************** Start of getConnection method***************************/    
    //function to create connection
    public Connection getConnection(){
        Connection connection=null;
        //Step 1:Load driver
        try{
           Class.forName("org.postgresql.Driver"); 
           System.out.println("Driver loaded successfully");
        }catch(ClassNotFoundException cnfe ){
            System.out.println("Driver loading failed "+cnfe.getMessage());
        }
 /******************************Establish connection**********************************************/       
        //Step 2:Establish connection
        try{
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ZardApartment","postgres","postgre");
            System.out.println("Successfully connected to the database");

        }catch(SQLException sqle){
            System.out.println("could not establish a connection "+sqle.getMessage());
        }
         return connection;
        
      }
    
    public void select(){
        
    }
    public void insert(){
        
    }
    public void update(){
        
    }
    public void delete(){
        
    }
}
