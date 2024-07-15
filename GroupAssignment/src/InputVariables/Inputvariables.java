
package InputVariables;

import java.util.Scanner;
public class Inputvariables {
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int intVal;
       boolean boolVal;
       char charVal;
       float floatVal;
       long longVal;
       double doubleVal;
       short shortVal;
       byte byteVal;
       
       System.out.println("Please enter a boolean value: ");
       boolVal=in.nextBoolean();
        System.out.println("Please enter a character value: ");
       charVal=in.next().charAt(0);
        System.out.println("Please enter a float value: ");
       floatVal=in.nextFloat();
        System.out.println("Please enter a long value: ");
       longVal=in.nextLong();
        System.out.println("Please enter a double value: ");
       doubleVal=in.nextDouble();
        System.out.println("Please enter a short value: ");
       shortVal=in.nextShort();
        System.out.println("Please enter a byte value: ");
       byteVal=in.nextByte();
        System.out.println("Please enter a int value: ");
       intVal=in.nextInt();
          
       in.close();
       System.out.println("boolean value: "+boolVal);
       System.out.println("character value: "+charVal);
       System.out.println("float value: "+floatVal);
       System.out.println("long value: "+longVal);
       System.out.println("double value: "+doubleVal);
       System.out.println("short value: "+shortVal);
       System.out.println("byte value: "+byteVal);
       System.out.println("int value: "+intVal);
    }
    
}


