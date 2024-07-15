
package Employee;

import java.text.NumberFormat;

public class Employee {
     int employee_ID;
     String employee_name;
     String SS_No;
     double salary;
    String deptName;
     
     public Employee(int empID,String name,String ssn,double Salary){
         employee_ID=empID;
         employee_name=name;
         SS_No=ssn;
         salary=Salary;
     }
     
     
     public int getemployee_ID(){
         return employee_ID;
     }
    
     public String getemployee_name(){
         return employee_name;
     }
     public void setemployee_name(String name){
         employee_name=name;
     }
     
      public String getSS_No(){
         return SS_No;
     }
    
      public double getsalary(){
         return salary;
     }
    
     public void raiseSalary(double increase){
         
     }

    @Override
    public String toString() {
                NumberFormat.getCurrencyInstance().format(getsalary());

        return  "Employee Details:\n" +
               "Name: " + employee_name + "\n" +
               "Employee ID: " + employee_ID + "\n" +
               "SSN: " + SS_No + "\n" +
               "Salary: $" + salary; 
    }

     
}
