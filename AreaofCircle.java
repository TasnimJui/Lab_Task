
package com.codes.areaofcircle;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, area;
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle: "+area);
    
       
    }
}
