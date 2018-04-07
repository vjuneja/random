package com.van;

import java.util.Random;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        long circleArea = 0;

        long squareArea = 0;

        while(true){
         double randX = r.nextFloat();
         double randY = r.nextFloat();

         squareArea++;
         if((randX * randX + randY * randY) <= 1.0) {
            circleArea++;
            System.out.println("pi after " + squareArea + " = " + (4.0 * circleArea)/squareArea);
         }
        }
    }
}
