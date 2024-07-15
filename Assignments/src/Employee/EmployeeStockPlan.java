
package Employee;


public class EmployeeStockPlan {
    
   public int grantStock(Employee emp){
       if(emp instanceof Director){
           return 1000;
       }else if(emp instanceof Manager){
           return 100;
       }else
           return 10;
   }
    
}
