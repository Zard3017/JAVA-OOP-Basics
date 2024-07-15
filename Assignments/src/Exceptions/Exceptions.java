
package Exceptions;

import javax.swing.JOptionPane;


public class Exceptions {
     public static void main(String[]args){
        String numerator;
        String denominator;
        double result=0;
        
        numerator=JOptionPane.showInputDialog(null, "Input numerator: ") ;
        
        
        denominator=JOptionPane.showInputDialog(null, "Input denominator: ") ;
        //prompt user to enter numerator
     
        //double num=Double.parseDouble(numerator);
        //double denum=Double.parseDouble(denominator);
        
        int num=Integer.parseInt(numerator);
        int denum=Integer.parseInt(denominator);
        
        try{
           result=num/denum; 
        }
        catch(ArithmeticException ae){
            System.out.println("Please kindly enter a non-zero denominator: ");
            //e.printStackTrace();
            
        }
        catch(NumberFormatException nfe){
            System.out.println("Enter number in correct format ");
        }
        catch(Exception e){
            System.out.println("Some other error has occurred");
        }
        finally{
            //code to execute come what may
        }
        
        //JOptionPane.showMessageDialog(null, "Result is "+result);
       
        }
    }



