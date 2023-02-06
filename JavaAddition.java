package com.codes.javaaddition;

import java.util.Scanner;


public class JavaAddition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 , n2 , sum ;
        n1 = input.nextInt();
        n2 = input.nextInt();
        sum = n1 + n2;
        System.out.println("Result = "+sum);
    }
}
