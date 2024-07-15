
package DBPractice;


public class Patients {
    public String patientName;
    private int patientDOB;
    public int patientNo;
    
   
    public Patients(String patientName,int newpatientNo){
        patientNo= newpatientNo;
    }    
    
    
    public int getpatientDOB(){
        return this.patientDOB;
    }
    
    public void setpatientDOB(int newpatientDOB){
        patientDOB=newpatientDOB;
         
    }
    
    public void requestPrescription(){
        System.out.println("Hello my name is"+patientName+"requesting to have my prescribed drugs. My patient number is"+patientNo);
    }
     
}






