package Encapsulation;

public class Student {
    public int student_id;
    
    //private method
    private String studentName;
    private String tiktokUsername;
    private String Residence;
    
    //getter
    public String getStudentName(){
        return this.studentName;
    }
    public String getTiktokUsername(){
        return this.tiktokUsername;
    }
    public String getResidence(){ 
        return this.Residence;
    }
    
    //setters
    public void setStudentName(String newStudentName){
        studentName=newStudentName;
    }
    
    public void setTiktokUsername(String newTiktokUsername){
        tiktokUsername=newTiktokUsername;
    }
    
    public void setResidence(String newResidence){
        Residence = newResidence;
    }
    
}
