
package Inheritance2;
public class ChildPatient extends Patient {
   
       public String immunizationSchedule;
       public String babycot;
       
       public ChildPatient(int newpatientAge ,int newpatientId, String newpatientName,String newimmunizationSchedule,String newbabycot){    
       super(newpatientAge, newpatientName);
       
       immunizationSchedule=newimmunizationSchedule;
       babycot=newbabycot;
       patientId=newpatientId;
       
    }
       
       @Override
        public void seeDoctor(){
        System.out.println("Hello my name is "+super.getPatientName()+" My son needs to see Doctor Kenneth. His ID is "+ patientId);
        System.out.println("His age is "+patientAge);
    
    }
       
      
        
      
    } 


