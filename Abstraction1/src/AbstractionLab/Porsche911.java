
package AbstractionLab;


public class Porsche911 extends Porsche {
    
    public int engineCapacity;
    public int nightvision;
    
     public Porsche911(int newspeed,int newhorsepower,int acceleration){
        topSpeed=newspeed;
        accelerationTime=acceleration;
        horsepower=newhorsepower;
    }
    
    @Override
    public void enableSportsMode(){
        System.out.println("Sports mode has been enabled");
        
    }

    @Override
    public void accelerate(int topSpeed, int horsepower, int accelerationTime) {
        System.out.println("Your vehicle has started accelerating");
    }
        
         
        
    }


    
    
    

