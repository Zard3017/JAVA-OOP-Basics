
package AbstractionLab;


public   class PorschePanamera extends Porsche {
    
    public PorschePanamera(int newspeed,int newhorsepower,int acceleration){
        topSpeed=newspeed;
        accelerationTime=acceleration;
        horsepower=newhorsepower;
    }
    
    @Override
    public void enableSportsMode(){
        System.out.println("Sports mode has been enabled for "+super.horsepower);
    
}

    @Override
    public void accelerate(int topSpeed, int horsepower, int accelerationTime) {
        System.out.println("Acceleration at 180MPH");
    }
    
   
    
}
