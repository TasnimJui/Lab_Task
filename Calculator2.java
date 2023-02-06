
package com.codes.calculator2;

import java.util.Scanner;

public class Calculator2 {
 
    public static void main(String[] args) {
        char op;
        int a,b,res;
        Scanner input = new Scanner(System.in);
        op = input.next().charAt(0);
        a = input.nextInt();
        b = input.nextInt();
        switch (op){
            case '+':
                res = a + b ;
                System.out.println( a + " + " + b + "=" +res);
                break;
            case '-':
                res = a - b ;
                System.out.println( a + " - " + b + "=" +res);
                break;
                case '*':
                res = a * b ;
                System.out.println( a + " * " + b + "=" +res);
                break;
                case '/':
                res = a / b ;
                System.out.println( a + " / " + b + "=" +res);
                break;
                default:
                    System.out.println("Invalid");
                break;
        }
        
        

   
        
      
    }
}


    