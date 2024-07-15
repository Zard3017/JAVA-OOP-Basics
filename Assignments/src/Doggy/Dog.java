
package Doggy;

/**
 *
 * @author User
 */
 class Pet {
     protected String name;
     protected String breed;
     private double weight;
    
}

public class Dog extends Pet{
    
    private String barkNoise = "Woof";
    
    public static int count;
    
    public Dog(String name,String breed,String noise,double weight,String colour){
        this.name=name;
        this.breed=breed;
        this.barkNoise=noise;
        
        
        this.count++;
                
    }
    public int getCount(){
        return this.count;
    }
    public static void someMethod(){
        new Dog ("Puff-puff","Labrador","Woof-woof",23.6,"Brown");
    }
       
}
