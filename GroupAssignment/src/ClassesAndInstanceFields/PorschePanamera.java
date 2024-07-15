
package ClassesAndInstanceFields;


public class PorschePanamera extends Porsche {
    
    private String exhaust;
    
    public PorschePanamera(String exhauster, String colour,String horsepower){
        super(horsepower,colour);
        
        this.exhaust = exhauster;
    }

    
    
    public String getexhaust(){
        return this.exhaust;
        
    }
    public void setexhaust(String exhausttype){
        exhaust=exhausttype;
    }

    
}
