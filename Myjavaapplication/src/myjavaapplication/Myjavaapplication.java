/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myjavaapplication;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Myjavaapplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String name = "Brad";
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Say my name");
       name = sc.nextLine();
       
       System.out.println("Hi, my name is "+name);
    }
    
}
