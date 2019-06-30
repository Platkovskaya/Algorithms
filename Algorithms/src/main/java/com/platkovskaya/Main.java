package com.platkovskaya;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Irina on 30.06.2019.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("-> Input number: ");
        numberValidation(scanner.nextInt());

        System.out.println("-> Input name: ");
        scanner.nextLine();
        nameValidation(scanner.nextLine());

        System.out.println("-> Input array size: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        System.out.println("Your array is: " + Arrays.toString(array));
        arrayAlgorithm(array);

        System.out.println("----- Goodbye! -----");

        scanner.close();
    }

    private static void numberValidation(int number) {
        if (number > 7) {
            System.out.println("Hello!");
        } else {
            System.out.println("You input number less than '7'");
        }
    }

    private static void nameValidation(String name) {
        if (name.equals("Vyacheslav")) {
            System.out.println("-> Hello Vyacheslav!");
        } else {
            System.out.println("No such name!");
        }
    }

    private static void arrayAlgorithm(int[] arr) {
        boolean isMultipleFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] != 0) {
                isMultipleFound = true;
                System.out.println("-> " + arr[i] + " multiple of 3");
            }
        }
        if (!isMultipleFound) {
            System.out.println("There are no multiples of 3 in this array!");
        }
    }
}