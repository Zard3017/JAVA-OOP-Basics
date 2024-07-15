/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConditionalStatement1;

import java.util.Scanner;
public class ValueChecker {
    


public static void main (String[]args){

Scanner in = new Scanner(System.in);

int value = 0;
System.out.println("Input a number:");
value = in.nextInt();

if(value == 7){
System.out.println("That's lucky!");
}

else if (value == 13){
System.out.println("That's unlucky!");
}

else {
System.out.println("That number is neither lucky nor unlucky!");
}

in.close();
}
}


