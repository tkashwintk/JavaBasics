package com.example.learnjava.conditions;

public class Statements {

    public static void main(String[] args) {

        // Simple if else
        int x = 20;
        if (x >= 10) {
            System.out.println("x is greater than or equal to 10");
        } else {
            System.out.println("x is less than 10");
        }

        // If statement with multiple conditions
        int y =10, z = 10;

        if (x>10 && y<100 || z==10) {
            System.out.println("Condition matched");
        }

        // Switch statement
        int a = 100;
        switch (a) {
            case 100:
                System.out.println("x = 100");
                break;

            case 200:
                System.out.println("x = 200");
                break;

            default:
                System.out.println("value of x is not what we expect");
        }
    }
}
