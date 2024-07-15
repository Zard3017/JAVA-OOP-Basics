
package Exceptions;
import java.util.Scanner;


public class ExceptionsDemo {
    public static void main(String[]args){
        int numerator;
        int denominator;
        double result;
        
        Scanner input = new Scanner(System.in);
        //prompt user to enter numerator
        System.out.println("Enter numerator: ");
        
        //capture user input using scanner and store it
        numerator=input.nextInt();
        
        //prompt user to enter denominator
        System.out.println("Enter denominator: ");
        //capture and store it
        denominator=input.nextInt();
        
          //compute as a decimal
          result=numerator/denominator;
          System.out.println("Result is: "+result);
        }
    }

