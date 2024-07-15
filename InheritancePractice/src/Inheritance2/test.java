
package Inheritance2;
public class test {
    public static void main(String[]args){
        
        Patient p01= new Patient(3,"Paulsen");
        Patient p02  = new ChildPatient(1,8765,"Amario","BCG,Polio","Cot 123, Kisima Ward");       
        ChildPatient cp11 = new ChildPatient(5,789865,"Anto","Hepatitis B","Cot 911, Masimba Ward");
        
        
        p01.requestPrescription("Dawa");
        p02.seeDoctor();
        cp11.seeDoctor();
    }
    
}
