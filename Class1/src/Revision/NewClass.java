
package Revision;


public class NewClass {
    
 public static void main(String[] args){
 String string1 = "Hello";
 String string2 = "Caron";
 String string3 = ""; //empty String or null
 string3 = "How are you "+ string2.concat(string2);
 System.out.println("string3: "+ string3);
 //get length
 System.out.println("Length: "+ string1.length());
 //get substring beginning with character 0, up to, but not
 //including character 5
 System.out.println("Sub: "+ string3.substring(0,5));
 //uppercase
 System.out.println("Upper: "+string3.toUpperCase());
 }
}

