
package Lab2encapsulation;

public class Maincustomer {
    public static void main(String[]args){
        //instantiation
        Customer c001 = new Customer();
        Customer c002= new Customer();
        Customer c003 = new Customer();
        Customer c004 = new Customer();
        
        c001.setCustomerName("Abby");
        System.out.println(c001.getcustomerName());
        
        c002.setCustomerAge(78);
        System.out.println(c002.getcustomerAge());
        
        c003.setCustomerID(23984567);
        System.out.println(c003.getcustomerID());
        
        c004.setCustomerName("Gideon");
        System.out.println(c004.getcustomerName());
        
    }
    
}
