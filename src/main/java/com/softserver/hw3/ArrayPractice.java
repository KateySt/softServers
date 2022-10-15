package com.softserver.hw3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] array = new int[10];
        fillArray(array);
        //------------1-----------------
        sumArrayBetweenIndex(minIndex(array), maxIndex(array), array);
        //------------2------------------
        int[] array1 = {2, 0, 10, 4, 11, 5, 7, 9, 40, 1};
        loopingMove(array1, array.length - 1);

        //------------3---------------------
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 6, 7};
        int[] resultArray = unionOfArrays(array2, array3);
        System.out.println(Arrays.toString(resultArray));

    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        printArray(array);
    }

    public static int minIndex(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Index min: " + index);
        return index;
    }

    public static int maxIndex(int[] array) {
        int max = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Index max: " + index);
        return index;
    }

    public static void sumArrayBetweenIndex(int index1, int index2, int[] array) {
        int sum = 0;

        for (int i = index1 + 1; i < index2; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void loopingMove(int[] arr, int indexElement) {
        int count = 2;
        int num = arr[indexElement];
        for (int i = indexElement; i > 0; i--) {
            printArray(arr);
            count = arr[i - 1];
            arr[i - 1] = num;
            arr[i] = count;
        }
        printArray(arr);
    }

    public static int[] unionOfArrays(int[] array1, int[] array2) {

        int[] array3 = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);

        return array3;
        //return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();
    }

    public static void printArray(int[] arr) {
        for (int a : arr)
            System.out.print(a + " ");
        System.out.println();
    }
}
