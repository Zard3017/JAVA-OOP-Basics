package Database;
//import the connection interface
import java.sql.*;
import java.sql.DriverManager;

public abstract class DBConnection {
    public Connection con=getConnection();
    
            //API:DBMS//Server:####/DBName
    String url = "jdbc:postgresql://localhost:5432/UniversityDB";
    String username="postgres";
    String password="postgre";

    //public DBConnection() {
        //this.con = null;
    //} 
    
    
    
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
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/UniversityDB","postgres","postgre");
            System.out.println("Successfully connected to the database");

        }catch(SQLException sqle){
            System.out.println("could not establish a connection "+sqle.getMessage());
        }
         return connection;
        
      }
    public abstract void insert();
    
    public abstract void select(int id);
    
    public abstract void update();
    
    public abstract void delete();
        
        
    }

