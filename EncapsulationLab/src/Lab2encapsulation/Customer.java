package Lab2encapsulation;

public class Customer {
    
    //private attributes
    private String customerName;
    private int customerAge;
    private int customerID;
    
    //getters
    public String getcustomerName(){
        return this.customerName;
    }
    
    public int getcustomerAge(){
        return this.customerAge;
    }
    
    public int getcustomerID(){
        return this.customerID;
    }
    
    //setters
    public void setCustomerName(String newCustomerName){
        customerName= newCustomerName;
    }
    public void setCustomerID(int newCustomerID){
        customerID=newCustomerID;
    }
    public void setCustomerAge(int newCustomerAge){
        customerAge = newCustomerAge;
    }
    
}
