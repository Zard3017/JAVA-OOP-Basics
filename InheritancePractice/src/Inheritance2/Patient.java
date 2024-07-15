
package Inheritance2;

public class Patient {
     //class variable
    public  int patientAge;
    protected int patientId;
    private String patientName;
    
    //constructor
    public Patient(int newpatientAge, String newpatientName){
       patientAge=newpatientAge;
       patientName=newpatientName;
       
    }
    
    
    //methods
    //general method
    
    public void seeDoctor(){
         System.out.println("Hello my name is "+patientName+" requesting to see Doctor Keneeth. My patient ID is "+patientId);
    }
    
    public void requestPrescription(String Paracetamol){
         System.out.println("Hello my name is "+patientName+" requesting for my prescribed drug "+Paracetamol);
    }
    
   

    public String getPatientName() {
        return this.patientName;
    }
    public void setPatientName(String newpatientName){
        patientName=newpatientName;
    }

    
}
