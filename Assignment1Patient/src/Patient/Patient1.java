/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

/**
 *
 * @author User
 */
import java.util.Date;

/**
 *
 * @author User
 */
class Patient {
    //variables/attributes
    public String patientName;
    public int patientID;
    public String patientAge;
    public Date admissionDate;
    public String medicalCondition;
   
    //class variable
    public static String doctorAssigned;
    
    //
    String name;
    String ID;
    String age;
    String medCondition;
    String admDate;
    String doc_assigned;

   
    
    public  void  Patient(String name,int ID,String age, Date admDate, String medCondition,String doc_assigned){
    
    patientName=name;
    patientID=ID;
    patientAge=age;
    admissionDate = admDate;
    medicalCondition = medCondition;
    doctorAssigned = doc_assigned;
   
}
      public static void Patient(){
        doctorAssigned="Doctor Ericksen";
    }
    //general methods
    public void requestDischarge(){
        System.out.println("Hello my name is "+name+" requesting for discharge.  "+admDate +"age "+age);}
    
    public void requestAppointment(){
        System.out.println("Hello my name is "+name+" requesting for an appointment with Doctor.  "+doc_assigned);}
    
    public void updateMedicalCondition(){
        System.out.println("Hello my name is "+name+" Please udate me on my medical condition.My ID is "+ID);}
     
     public void requestPrescription(){
        System.out.println("Hello my name is "+name+" requesting for my prescription.I am age "+age);}
     
}