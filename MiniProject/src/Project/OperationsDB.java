/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class OperationsDB extends MyConnection {
    
    String clientID;
    String clientName;
    String phoneNumber;
    String houseNumber;
    
     public void select(String clientID){
         try{
            String query = " SELECT * FROM Tenants WHERE clientID =?,clientName = ?,phoneNumber=?,houseNumber=?";
            
            PreparedStatement pst = con.prepareStatement(query);
            
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String clientName= rs.getString(1);
                String phoneNumber = rs.getString(2);
                String houseNumber= rs.getString(3);
                
                System.out.println(clientID + "" + clientName + "" + phoneNumber+""+houseNumber+"");
            }
            rs.close();
            pst.close();
            
        }catch(SQLException sqle){
                    System.out.println("Could not select :"+sqle.getMessage());
                    }
    }
     
    @Override
      public void insert(){
         try{
            String query = " INSERT INTO Tenants clientID ,clientName,phoneNumber,houseNumber,"+"values(?,?,?,?)";
            
            PreparedStatement pst = con.prepareStatement(query);
            
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String clientID=rs.getString(1);
                String clientName= rs.getString(2);
                String phoneNumber = rs.getString(3);
                String houseNumber= rs.getString(4);
                
                System.out.println(clientID + "" + clientName + "" + phoneNumber+""+houseNumber+"");
            }
            rs.close();
            pst.close();
            
        }catch(SQLException sqle){
                    System.out.println("Could not select :"+sqle.getMessage());
                    }
    }
      
    @Override
       public void update(){
         try{
            String query = " UPDATE Tenants SET clientName = ?,phoneNumber=?,houseNumber=? where clientID=?";
            
            PreparedStatement pst = con.prepareStatement(query);
            
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String clientID=rs.getString(1);
                String clientName= rs.getString(2);
                String phoneNumber = rs.getString(3);
                String houseNumber= rs.getString(4);
                
                System.out.println(clientID + "" + clientName + "" + phoneNumber+""+houseNumber+"");
            }
            rs.close();
            pst.close();
            
        }catch(SQLException sqle){
                    System.out.println("Could not select :"+sqle.getMessage());
                    }
    }
     
     
     
     
}

