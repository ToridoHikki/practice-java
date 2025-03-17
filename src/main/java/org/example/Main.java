package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
//        DongVat dongVat = new Meo();
//
//        Meo meoCon = new Meo();
//        meoCon.keu();
//        meoCon.keu("Ta la meo day");
//        meoCon.an();
//
//        XeVinFast vinFast = new XeVinFast();
//        vinFast.color = "red";

        int [] arr = {24, 12, 34, 56, 78, 90};

        findMax(arr);
        getSum(arr);
        getGreater30(arr);
    }

    //find max in = [24, 12, 34, 56, 78, 90]
    public static void findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.println("Max: " + max);
    }

    public static void getSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int sum = Arrays.stream(arr)
                .sum();

        System.out.println("Sum: " + sum);
    }

    public static void getGreater30 (int[] arr) {
        //find number > 30 in array
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int[] greater30 = Arrays.stream(arr)
                .filter(x -> x > 30)
                .toArray();

        System.out.println("Number > 30: " + Arrays.toString(greater30));

    }

}



