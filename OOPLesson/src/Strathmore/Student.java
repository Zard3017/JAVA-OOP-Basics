
package Strathmore;
//This is a class where I define a student

public class Student {
    //variables or attributes
    
    //class variable
    public  String student_course;
    
    //Instance variable
    public  String student_name;
    
    //constructor
    public Student(){
        student_course = "BBIT";
    
    }
    
    //methods
    //general method
    public void introduce(){
        System.out.println("Hello my name is "+student_name+" studying "+student_course);
    
    }
    
}
