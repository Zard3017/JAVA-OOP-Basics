package ClassesAndInstanceFields;


public class PorscheCayenne extends Porsche{
    private String name;
    private double accelerationTime;
    private String engineNoise = "Vroom";
   
   
    //constructor
    public PorscheCayenne(String name,String horsepower, double Time,String colour){
        super(horsepower,colour);
        this.name = name;
        this.accelerationTime = Time;
        
    }
    
     public PorscheCayenne(String name, String horsepower, String noise, double Time,String colour){
        super(horsepower,colour);
        this.name = name;
        this.accelerationTime = Time;
        engineNoise = noise;
    }

   
    
     //getters
     public String getname(){
         return this.name;
     }
     public double getaccelerationTime(){
         return this.accelerationTime;
     }
     public String getengineNoise(){
         return this.engineNoise;
     }
     
     //setters
     public void setname(String Name){
         name=Name;
     }
     public void setaccelerationTime(double Time){
         accelerationTime=Time;
     }
     public void setengineNoise(String noise){
         engineNoise=noise;
     }
     
     public void rev(){
         System.out.println(engineNoise);
     }
     public void startEngine(String engineNoise){
         System.out.println(engineNoise);
     }
             
    
}
