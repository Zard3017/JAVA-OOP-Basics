/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;


public  class main {
    public static void main(String[]args){
        //initialization 
       Patient p001;
       Patient p002;
       Patient p003;
       Patient p004;
       
       p001=new Patient();
       p002=new Patient();
       p003=new Patient();
       p004 = new Patient();
       
       p001.name="Ian";
       p001.ID="223454";
       p001.age="54";
       p001.admDate="26-Jan-2023";
       p001.medCondition="Poor";
       p001.doc_assigned="Ericksen";
       
       p002.name="Ryback";
       p002.ID="22334";
       p002.age="23";
       p002.admDate="26-Jan-2025";
       p002.medCondition="Poor";
       p002.doc_assigned="Ericksen";
       
       p003.name="Gloria";
       p003.ID="43637";
       p003.age="14";
       p003.admDate="22-Mar-2023";
       p003.medCondition="Fair";
       p003.doc_assigned="Ericksen";
       
       p004.name="Go Pato";
       p003.ID="4363";
       p003.age="65";
       p003.admDate="22-Mar-2012";
       p003.medCondition="Good";
       p003.doc_assigned="Ericksen";
       
       
       
       p001.requestDischarge();
       p002.requestAppointment();
       p003.updateMedicalCondition();
       //p004.viewDetails();
       p001.requestPrescription();
       
       
       
       
       
      
        
        
        
  
   

        
        
    }
    
}
