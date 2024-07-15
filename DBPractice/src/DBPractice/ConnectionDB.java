package DBPractice;

import java.sql. *;
public class ConnectionDB {
     public Connection con=getConnection();
            
    String url = "jdbc:postgresql://localhost:5432/HospitalDB";
    String username="postgres";
    String password="postgre";
    
// Start of getConnection method    
    //function to create connection
    public Connection getConnection(){
        Connection connection=null;
        //Load driver
        try{
           Class.forName("org.postgresql.Driver"); 
           System.out.println("Driver loaded successfully");
        }catch(ClassNotFoundException cnfe ){
            System.out.println("Driver loading failed "+cnfe.getMessage());  
        }
           
        //Step 2:Establish connection
        try{
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/HospitalDB","postgres","postgre");
            System.out.println("You have successfully connected to the Hospital Database ");

        }catch(SQLException sqle){
            System.out.println("Could not establish a connection "+sqle.getMessage());
        }
         return connection;
        
      }
    
    //Database operation
      public  void insert(){
           
    }
    public void select(int patientNo){
        
    }
    public void update(int patientNo){
        
    }
    public void delete(int patientNo){
        
    }
        
 }
    
    
    
    
    

