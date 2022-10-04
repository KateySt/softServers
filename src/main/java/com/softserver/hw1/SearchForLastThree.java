package com.softserver.hw1;

import java.util.Scanner;

public class SearchForLastThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number : ");
        int num = sc.nextInt()%10;

        if (num == 3)
            System.out.println("The last three found");
        else
            System.out.println("The last three no found");

    }

}
