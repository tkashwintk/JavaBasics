package com.example.learnjava.loops;

import java.util.Arrays;
import java.util.List;

public class Loops {
    public static void main(String[] args) {

        // While Loops
        int x = 9;
        while (x > 5) {
            System.out.println("While Loop logic executed");
            x--;
        }


        // do-while Loops
        int y = 10;
        do{
            System.out.println("Do-While Loop logic executed");
        } while (y>10);

        // For Loops
        for (int a=0; a<=3; a++) {
            System.out.println("For Loop Logic executed");
        }

        // Endless For Loop
//        for(;;){
//            System.out.println("Infinite Endless Loop");
//        }

        // Enhanced For Loop (only for Arrays and Collections)
        // Syntax:  for(declaration: expression)
        String [] fruits = {"Apple", "Orange", "Pineapple"};
        for (String fruit: fruits) {
            System.out.println("Fruit is: "+ fruit);
        }

        List<Integer> numbers = Arrays.asList(1,2,3,4);
        for (int num: numbers) {
            System.out.println("Number is: "+ num);
        }

        // Break and Continue statements
        for (int z=0; z<10; z++) {
            if (z <=5 ){
                System.out.println("Value of z is: "+z);
                continue;
//                System.out.println("This is an unreachable statement"); // Compilation Error
            }

            if(z == 6) {
                System.out.println("Value of z is: "+z);
                break;
            }
        }

    }
}
