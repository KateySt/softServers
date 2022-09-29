package com.softserver.hw1;

import java.util.Scanner;

public class AmountOfMoney {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number (0-10): ");
        int num = sc.nextInt();

        if (num == 1)
            System.out.println(num + " гривня");
        else if (num >= 2 && num <= 4)
            System.out.println(num + " гривні");
        else if ((num >= 5 && num <= 10) || num == 0)
            System.out.println(num + " гривень");
        else
            System.out.println("incorrect input");
    }

}
