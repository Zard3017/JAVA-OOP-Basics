
package AbstractClasses;


public class Triangle extends Shape {
    public double b,h;

    @Override
    public double findArea() {
        h=1;
        b=1;
        return 0.5*b*h;
        
    }
    public String toString(){
        return "I am a Triangle";
    }
    
   
            
}
