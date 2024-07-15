
package DBPractice;

import java.sql.*;


public class DataOperation extends ConnectionDB{
    @Override
    public  void insert(){
        
        
        
    }
    
    @Override
    public void select(int patientNo){
         try{
            String query = " SELECT * FROM Patients WHERE patientNo = 124";
            
            PreparedStatement pst = con.prepareStatement(query);
            //pst.setInt(1, patientNo);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String pName = rs.getString(1);
                String pDOB = rs.getString(2);
                String pNo = rs.getString(3);
                
                System.out.println(pName + "" + pDOB + "" + pNo);
            }
            rs.close();
            pst.close();
            
        }catch(SQLException sqle){
                    System.out.println("Could not select :"+sqle.getMessage());
                    }
    }
    @Override
    public void update(int patientNo){
        try{
            String query = "UPDATE Patients  WHERE patientNo='124' ";
            
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, patientNo);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String pName = rs.getString(1);
                
                String pDOB = rs.getString(2);
                String pNo = rs.getString(3);
                
                System.out.println(pName + ""+pDOB+ ""+pNo);
            }
            rs.close();
            pst.close();
            
        }catch(SQLException sqle){
                    System.out.println("Could not select :"+sqle.getMessage());
                    }
    }
        
    
        
        
       
        
    
    
    @Override
    public void delete(int patientNo){
         try{
            String query = "DELETE * FROM Patients WHERE patientNo ='167'";
            
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, patientNo);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String pName = rs.getString(1);
                
                String pDOB = rs.getString(2);
                String pNo = rs.getString(3);
                
                System.out.println(pName + ""+pDOB+ ""+pNo);
            }
            rs.close();
            pst.close();
            
        }catch(SQLException sqle){
                    System.out.println("Could not select :"+sqle.getMessage());
                    }
    }
        
    }
        
    
    
    

