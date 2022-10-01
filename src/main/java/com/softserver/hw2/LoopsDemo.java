package com.softserver.hw2;

import java.util.Scanner;

public class LoopsDemo {
    private static int var = 2;

    public static void main(String[] args) {

        System.out.println("ex. 1");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of numbers : ");

        int n = sc.nextInt();

        int i = 0;
        int counter = 0;
        int sum = 0;

        while (counter != Math.abs(n)) {
            if (i % 2 == 1) {
                System.out.println(i);
                sum += i;
                counter++;
            }
            i++;
        }
        System.out.println("Sum : " + sum);

        //------------------------------------------------

        System.out.println("ex. 2");

        for (int j = 10; j <= 50; j++) {
            if (j % 3 == 0) {
                System.out.printf("%d; ", j);
            }
        }

        //-------------------------------------------------

        System.out.println("\nex. 3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of numbers : ");

        int num = scanner.nextInt();

        checkIsItANaturalNumber(num);

        //------------------------------------------------

        System.out.println("ex. 4");

        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Enter number of numbers : ");

        int n4 = scanner4.nextInt();

        System.out.printf("The first %d Fibonacci numbers are : \n", n4);

        int n0 = 1;
        int n1 = 1;
        int n2;
        double sumF = n0 + n1;

        System.out.printf("%d %d ", n0, n1);

        for (int k = 3; k <= n4; k++) {
            n2 = n0 + n1;
            sumF += n2;
            System.out.printf("%d ", n2);
            n0 = n1;
            n1 = n2;
        }

        System.out.printf("\nThe average is %.1f ", sumF / n4);

    }

    private static void checkIsItANaturalNumber(int n) {
        if (n > 1) {
            if (n % var != 0) {
                var++;
                checkIsItANaturalNumber(n);
            } else if (n % var == 0) {
                printIsItNaturalNumber(var, n);
            }
        }
    }

    private static void printIsItNaturalNumber(int var, int n) {
        if (var == n) {
            System.out.println(n + " is a natural number.");
        } else {
            System.out.println(n + " is not a natural number.");
        }
    }
}
