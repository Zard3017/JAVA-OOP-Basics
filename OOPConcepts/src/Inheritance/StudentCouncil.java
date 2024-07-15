
package Inheritance;



public class StudentCouncil extends Student {
    
       public String role;
       public String officeLoc;
       
       public StudentCouncil(int newStudentId, String newStudentName,String newRole,String newOfficeLoc){    
       super(newStudentId, newStudentName);
       
       role=newRole;
       officeLoc=newOfficeLoc;
       
    }
       
       @Override
        public void introduce(){
        System.out.println("Hello my name is "+super.getStudentName()+" studying "+studentCourse);
        System.out.println("I am the"+role);
    
    }
       
      
        
      
    } 
     
       
              
   
        
    
    
    

