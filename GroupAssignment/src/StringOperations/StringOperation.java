
package StringOperations;

public class StringOperation {
    
   public static void main(String[]args){
        
    
  String str1="Hello";
  String str2="Max";
  String str3="You are" + str2;

System.out.println("Welcome"+str3);
System.out.println("Length: "+str1.length());
System.out.println("Sub: "+str3.substring(0,5));
System.out.println("Upper: "+str2.toUpperCase());
System.out.println(str1.compareTo(str2));
System.out.println(str1.equals(str2));
if(str1.compareTo(str2)<0){
    System.out.println(str1 + " comes before "+str2);
}else{
    System.out.println(str2+" comes before "+str1);
  }
 }
}

