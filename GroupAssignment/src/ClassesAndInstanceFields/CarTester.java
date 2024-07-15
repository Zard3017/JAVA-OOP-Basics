
package ClassesAndInstanceFields;

public class CarTester {
    public static void main(String[]args){
        Porsche p01 = new Porsche("three hundred","blue");
        PorschePanamera c01 = new PorschePanamera("small exhauster","white","one sixty");
        
    
        System.out.println("Porsche colour : "+p01.getcolour());
        System.out.println("Porsche horsepower : "+p01.gethorsepower());
        
        System.out.println("Panamera colour: "+c01.getcolour());
        System.out.println("Panamera exhaust: "+c01.getexhaust());
    }
}
