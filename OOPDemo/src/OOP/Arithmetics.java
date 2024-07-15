/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author User
 */
public class Arithmetics {
    int first_number = 0;
    int second_number = 0;
    
    int sum(){
        int sum = 0;
        sum=first_number + second_number;
        return sum;
    }
    int difference(){
        int difference = 0;
        difference = first_number - second_number;
        return difference;
        
    }
    int product(){
        int product = 0;
        product = first_number * second_number;
        return product;
    }
    float quotient(){
        float quotient = 0;
        quotient = second_number / first_number;
        return quotient;
    }
    
}
