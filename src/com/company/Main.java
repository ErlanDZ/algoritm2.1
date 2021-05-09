package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //numbers();
        //array();
        naturalNumbers();
    }

    public static void numbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа: ");
        String a = in.nextLine();
        char[] arr = a.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);

        }
    }

    public static void array() {
        int[] arrays = {3, 2, 8, 9, 1, 5, 4, 3, 7, 8, 5, 9, 9};
        int max2 = arrays[0];

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
            if (max2 < arrays[i]) {
                max2 = arrays[i];
            }
        }
        System.out.println();
        System.out.println("Второе максимальное число: " + (max2 - 1));
    }

    public static void naturalNumbers() {
        int num = 2;
        System.out.println("начальный диапазон: " + num);
        Scanner num2 = new Scanner(System.in);
        System.out.println("Введите конечный  диапазон: ");
        int arg = num2.nextInt();
        int n1, arg1;
        for (n1 = num; n1<= arg; n1++){
            for (arg1 = num; (n1 % arg1) > 0; arg1++){
            }
            if (arg1 == n1){
                System.out.print(n1 + "\t");
            }
        }

    }
}






