
package Employee;

import java.text.NumberFormat;


public class Manager extends Employee {
    private String deptName;
    
    public Manager(int empID, String name, String ssn, double Salary, String deptname){
        super(empID,name,ssn, Salary);
        deptName=deptname;
       
    }
    
     public String getdeptName(){
         return deptName;
     }

    @Override
    public String toString() {
                NumberFormat.getCurrencyInstance().format(getsalary());

        return  "Employee Details:\n" +
               "Name: " + employee_name + "\n" +
               "Employee ID: " + employee_ID + "\n" +
               "SSN: " + SS_No + "\n" +
               "Salary: $" + salary +"\n"+"\n"+
                "Department :"+deptName; 
    }
}
