
package ConditionalStatement1;

import java.util.Scanner;



public class AgeChecker {
    
public static void main(String[]args){

Scanner in = new Scanner(System.in);

int age;
char holdLicense;

System.out.println("Enter your age:");
age = in.nextInt();

System.out.println("Do you hold a current driving license?");

holdLicense = in.next().charAt(0);

if((age > 20) && (holdLicense == 'y'))
System.out.println("You are an adult hence you can hire a car.");

else
System.out.println("You are not an adult hence you cannot hire a car.");

in.close();
}
}

