
package Employee;


public class Director extends Manager {
    private double budget;
    
    public Director(int empID, String name, String ssn, double Salary, String deptname, double Budget){
        super(empID, deptname,name,Salary, ssn);
        budget=Budget;
    }
  
     public double getbudget(){
         return budget;
     }
}
