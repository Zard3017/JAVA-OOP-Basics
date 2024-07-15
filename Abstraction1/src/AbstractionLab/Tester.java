
package AbstractionLab;


public class Tester {
    public static void main(String args[]){
        
        Porsche p11= new Porsche911(230,54,320);
        Porsche p01= new PorschePanamera(180,460,120);
        Porsche p02= new Porsche911(180,430,170);
        
        p11.accelerate(120, 700, 340);
        p01.enableSportExhaust();
        p02.enableSportsMode();
        
        
        
        
      }
    }
    

