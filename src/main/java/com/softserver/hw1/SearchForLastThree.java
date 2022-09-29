package com.softserver.hw1;

import java.util.Scanner;

public class SearchForLastThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number : ");
        int num = sc.nextInt();

        if ((num == 3) || (num > 10 && num % 10 == 0))
            System.out.println("The last three found");
        else
            System.out.println("The last three no found");

    }

}
