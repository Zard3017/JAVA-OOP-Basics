
package Hesabu;

import static java.lang.Double.NaN;
import static java.lang.Math.pow;


public class Calculator {
    public enum BiOperatorModes{
        normal,add,minus,multiply,divide,xpowerofy
    }
    
    public enum MonoOperatorModes{
        square,squareRoot,oneDividedBy,cos,sin,tan,log,rate,abs,ln
    }
    
    private Double num1,num2;
    private BiOperatorModes mode = BiOperatorModes.normal;
    
    private Double calculateBiMode(){
        if(mode.equals(BiOperatorModes.normal)){
            return num2;
        }
        if(mode.equals(BiOperatorModes.add)){
            if(num2 !=0){
                return num1+num2;
            }
            return num1;
        }
        if(mode.equals(BiOperatorModes.minus)){
            return num1-num2;
        }
        if(mode.equals(BiOperatorModes.multiply)){
            return num1*num2;
        }
        if(mode.equals(BiOperatorModes.divide)){
            return num1/num2;
        }
        if(mode.equals(BiOperatorModes.xpowerofy)){
            return pow(num1,num2);
        }
       
        throw new Error();
    }
    
    public Double calculateBi(BiOperatorModes newMode,Double num){
        if(mode.equals(BiOperatorModes.normal)){
            num2 = 0.0;
            num1 = num;
            mode= newMode;
            return NaN;
            
        }else{
            num2 = num;
            num1 = calculateBiMode();
            mode = newMode;
            return num1;
        }
    }
    
    public Double calculateEqual(Double num){
        return calculateBi(BiOperatorModes.normal,num);
    }
    public Double reset(){
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.normal;
        
        return NaN;
    }
    
    public DOUBLE calculateMonoNumbers(MonoOperatorModes newMode,Double num){
        
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
