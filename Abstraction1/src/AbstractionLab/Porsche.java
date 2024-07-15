package AbstractionLab;

public abstract class Porsche {
    public int horsepower;
    public int topSpeed;
    public int accelerationTime;
    
    public void enableSportExhaust(){
        System.out.println("Porsche Cayenne sports exhaust activated"+horsepower);
    }
    
    public abstract void enableSportsMode();
    
    public abstract void accelerate(int topSpeed,int horsepower,int accelerationTime);
        
    
        
    }
    
