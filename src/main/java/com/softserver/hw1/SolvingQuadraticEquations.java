package com.softserver.hw1;

public class SolvingQuadraticEquations {

    public static void main(String[] args) {

        int a = 2, b = 0, c = -18;

        double d = Math.pow(b, 2) - (4 * a * c);

        double x1 = 0, x2 = 0;


        if (d < 0) {
            System.out.println("there are no roots of the equation");
        } else if (d == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("the roots of the equations are the same : " + x1);
        } else if (d > 0) {
            x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            x2 = ((-b) - Math.sqrt(d)) / (2 * a);
            System.out.println("roots of the equation : x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("incorrect input");
        }
    }
}
