
package Employee;

import java.text.NumberFormat;


public class EmployeeTest {
    public static void main(String[]args){
        Employee e01= new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
        Employee m01 = new Manager(207,"Barbara Johnson","054-12-2367",109_501.36,"US Marketing");
        Employee a01 = new Admin(304,"Bill Monroe","108-23-6509",75_002.34);
        Employee d01 = new Director(12,"Susan Wheeler","099-45-2340",120_567.36,"Global Marketing",1_000_000.00);
        EmployeeStockPlan plan1 = new EmployeeStockPlan();
        
        System.out.println("\nFormatted Employee Objects:");
        System.out.println(e01);
        System.out.println(m01);
        System.out.println(a01);
        System.out.println(d01);
        System.out.println(plan1);
        
    }    
  public static void printEmployee(Employee e01,Employee m01,Employee a01,Employee d01){
      
  
      /* System.out.println("Name: " + e01.employee_name);
        System.out.println("Employee ID: " + e01.employee_ID);
        System.out.println("SSN: " + e01.SS_No);
        System.out.println("Salary: " + e01.salary + "\n");
        
        System.out.println("Employee ID: " + m01.employee_ID);
        System.out.println("SSN: " + m01.SS_No);
        System.out.println("Name: " + m01.employee_name);
        System.out.println("Salary: " + m01.employee_ID);
        System.out.println("Department: " + m01.deptName +"\n");
        
       System.out.println("Name: " + a01.employee_name);
        System.out.println("Employee ID: " + a01.employee_ID);
        System.out.println("SSN: " + a01.SS_No);
        System.out.println("Salary: " + a01.salary + "\n");
        
        System.out.println("Name: " + d01.employee_name);
        System.out.println("Employee ID: " + d01.employee_ID);
        System.out.println("SSN: " + d01.SS_No);
        System.out.println("Employee ID: " + d01.employee_ID);
        System.out.println("Department: " + d01.deptName + "\n");
*/
   
        
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

  
   
    
}
