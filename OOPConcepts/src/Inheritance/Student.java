
package Inheritance;


public class Student {
    //variables or attributes
    
    //class variable
    protected  String studentCourse;
    public int studentId;
    private String studentName;
    
    //constructor
    public Student(int newStudentId, String newStudentName){
       studentId=newStudentId;
       studentName=newStudentName;
    }
    
    
    //methods
    //general method
    
    public void introduce(){
         System.out.println("Hello my name is "+studentName+" studying "+studentCourse);
    }
    
    public void introduce(String nickname){
         System.out.println("Hello my name is "+nickname+" studying "+studentCourse);
    }
    
   

    public String getStudentName() {
        return this.studentName;
    }
    public void setStudentName(String newStudentName){
        studentName=newStudentName;
    }

   
        
    }
    
       
    
    
    

