
package Animal;


public class Cat extends Animal implements Pet {
    String name;
    
    public Cat(String Name){
        super(4);
        name=Name;
    }
    public Cat(){
         this("Fluffy");
    }
    
    public String getname(){
        return name;
    }
    public void setname(String Name){
        this.name=Name;
    }
     public void play() {
        System.out.println(name+" likes to play with string");
    }
     public void eat() {
        System.out.println("Ca");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

   
}
