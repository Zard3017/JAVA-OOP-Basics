
package Animal;


public class PetTester {

   
    public static void main(String[]args){
        Fish f01 = new Fish();
        
        f01.setName("Bryer");
        System.out.println("Fish f01 is called : "+f01.getName());
        f01.play();
        f01.eat();
        f01.walk();
        System.out.println("\n");
        
        Fish f02 = new Fish();
        System.out.println("Fish f02 name is "+f02.getName());
        f02.play();
        f02.eat();
        f02.walk();
         System.out.println("\n");
        

         //CAT
        Cat c001 = new Cat();
        System.out.println("Cat c001 name is: "+c001.getname());
        c001.setname("Fluffy");
        //System.out.println("c001 "+c001.getname());
        c001.play();
        c001.walk();
        c001.eat();
         System.out.println("\n");
        
        Cat c002 = new Cat("Gina");
        System.out.println("Cat c002 is : "+c002.getname());
        c002.play();
        c002.eat();
        c002.walk();
         System.out.println("\n");
        
        playwithAnimal(c001);   
        playwithAnimal(c002);   
        playwithAnimal(f01);   
        playwithAnimal(f02);   
        
    }

    public static void playwithAnimal(Animal A) {
       if(A instanceof Pet p01){
           p01.play();
       }else{
           System.out.println("Danger! Wild Animal");
       }
    }
    

    
}
