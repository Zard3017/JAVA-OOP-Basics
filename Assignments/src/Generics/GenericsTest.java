
package Generics;
import java.util.ArrayList;

public class GenericsTest {
    public static void main(String[]args){
        ArrayList <String> l= new ArrayList<String>();
        
        l.add("Bradley Lusalenge");
        l.add("Maxwell Kimani");
        l.add("Shirleen Wanyingi");
        l.add("Angela Faith");
        l.add("Hellen Karanja");
        
        
        //To retrieve a name 
        String name1 = l.get(0);
        
        System.out.println("The first name in the list is: " + name1);
       
    }
}
