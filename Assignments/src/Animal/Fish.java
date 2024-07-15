
package Animal;


public class Fish extends Animal implements Pet {
    String Name;
    
    public Fish(){
        super(0);
        setName("Tyger");
        
    }
    
    @Override
    public String getName(){
        return Name;
    }
    @Override
    public void setName(String name){
        this.Name=name;
    }
    @Override
    public void play() {
        System.out.println("Just swimming.");
    }
    @Override
     public void eat() {
        System.out.println("Fish eat pond scum.");
    }
    @Override
     public void walk(){
         super.walk();
         System.out.println("Fish,of course,can't walk ; they swim.");
     }

}
