/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarRental;

/**
 *
 * @author User
 */
public class Test {
    public static void main (String[]args){
//Animal animal = new Animal();  	  	 	 	
 //Dog dog = new Dog(); 	 	  	 	 	
 //Animal animaldog = new Dog();  
 
 //animal.makeNoise(); 
 //dog.makeNoise(); 
 //animaldog.makeNoise(); 	 

    //Upcasting
    //Animal animal = new Dog(); 
    //animal.makeNoise(); 
    
    
    
    
    //Downcasting
    Animal animal = new Dog(); 
        if (animal instanceof Dog) { 
            Dog dog = (Dog) animal; 
            dog.makeNoise();
    }
}
}
