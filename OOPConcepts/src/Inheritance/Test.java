package Inheritance;

public class Test {
    
    public static void main(String[]args){
        
        Student s01= new Student(111,"Paulsen");
        
        Student s02  = new StudentCouncil(345,"Caroline","Academic rep","STC 3rd Floor");
        
        StudentCouncil sc01 = new StudentCouncil(123,"James","President","STC 3rd Floor");
        
        
        sc01.introduce();
        s01.introduce("Jaymo");
        s02.introduce();
    }
    
}
