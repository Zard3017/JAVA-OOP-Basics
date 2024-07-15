
package AbstractClasses;

public class Circle extends Shape {
    public final double PI=3.14;
    private double radius;

    @Override
    public double findArea() {
       
        return PI*radius*radius;
    }
    
    
}
