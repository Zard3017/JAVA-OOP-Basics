
package ClassesAndInstanceFields;


public class Porsche {
    private String horsepower;
    private String colour;
    
    public Porsche(String horsepower, String colour ){
        this.colour=colour;
        this.horsepower= horsepower;
    }
    
    public String gethorsepower(){
        return this.horsepower;
    }
    public void sethorsepower(String Horsepower){
        horsepower=Horsepower;
    }
    
    public String getcolour(){
        return this.colour;
    }
    public void setcolour(String rangi){
        colour=rangi;
    }
}
