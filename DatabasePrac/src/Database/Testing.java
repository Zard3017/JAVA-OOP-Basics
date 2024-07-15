
package Database;


public class Testing {
    public static void main(String[]args){
        
       DBConnection db = new DBOperation();
        
       db.getConnection();
       db.select(1);
    }
    
}
