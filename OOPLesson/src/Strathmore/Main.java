
package Strathmore;

// This is a class where I CREATE AN OBJECT
//An object is an instance of the class Student whicH i DEFINED
public class Main {
    public static void main(String[]args){
    
    Student s001;
    Student s002;
    Student s003;
    
    //this is an object with the instance of a new Student
    s001 = new Student();//initialization and instantiation
    s002 = new Student();
    s003 = new Student();
    //Student s004=new Student();//instantiation only
    
    s001.student_name = "Harvey";
    s001.student_course = "BBIT";
    
    s002.student_name = "Angel";
    s002.student_course = "BICS";
    
    //s003.student_name = "Denise";
    //s003.student_course = "Law";
    
    s001.introduce();
    s002.introduce();
    s003.introduce();
    
    //System.out.println("Hello my name is "+ s001.student_name+ " ,Studying "+s001.student_course);
    //System.out.println("Hello my name is "+ s002.student_name+ " ,Studying "+s002.student_course);
    //System.out.println("Hello my name is "+ s003.student_name+ " ,Studying "+s003.student_course);

    
    }
}
