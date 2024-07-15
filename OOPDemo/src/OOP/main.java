/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author User
 */
public class main {
    
    public static void main(String[] args){
        //Create an object ar of the class Arithmetic
        Arithmetics ar;
        
        //create an instance and store in ar
        ar = new Arithmetics();
        Arithmetics ar2 = new Arithmetics();
        
        //OOP
        ar.first_number = 10;
        ar.second_number = 5;
        
        ar2.first_number = 76;
        ar2.second_number = 18;
        
        
        
        System.out.println(ar.sum());
        System.out.println(ar.difference());
        System.out.println(ar.product());
        System.out.println(ar.quotient());
        
        System.out.println(ar2.sum());
        System.out.println(ar2.difference());
        System.out.println(ar2.product());
        System.out.println(ar2.quotient());
    }
}
