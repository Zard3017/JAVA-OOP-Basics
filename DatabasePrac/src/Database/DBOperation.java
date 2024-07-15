package Database;
import java.sql.*;

public class DBOperation extends DBConnection {
    @Override
    public void insert(){
        
    }
    
    @Override
    public void select(int id){
        try{
            String query = " SELECT * FROM Student WHERE studId=?;";
            
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String sId = rs.getString(1);
                String sName = rs.getString(2);
                String sCourse = rs.getString(3);
                
                System.out.println(sId + ""+sName+ ""+sCourse);
            }
            
        }catch(SQLException sqle){
                    System.out.println("Could not select :"+sqle.getMessage());
                    }
    }

    @Override
    public void update() {
    }

    @Override
    public void delete() {
    }
    
    
}
