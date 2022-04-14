package com.BasicJava;

public class Function {

    static void InputData(int arr[], int number_value ) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number_value;
        }
    }
    static void PrintData(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu thu " + (i) + " la " + (arr[i]+number));
        }
    }


    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[6];


        InputData(arr1, 1);
        InputData(arr2, 2);
        PrintData(arr1, 3);
        PrintData(arr2, 3);
    }

}
