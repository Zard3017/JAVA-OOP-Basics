/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doggy;

/**
 *
 * @author User
 */
public class dogMain {
    public static void main(String[]args){
        Dog myDog = new Dog("Russ","German Shepherd","woof",50.76,"black");
        Dog yourDog = new Dog("JakePaul","Terrier","waf-waf",29.0,"brown") ;   
        Dog.someMethod();
        
        System.out.println(Dog.count);
    }
}
