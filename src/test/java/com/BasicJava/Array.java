package com.BasicJava;

/*public class Array {

    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        for (int i : arr) {
//            System.out.println(i);
//        }

        //khai bao va khoi tao mang
        String arr[] = new String[3];
            arr[0] = "10"; //gan gia tri
            arr[1] = "20";
            arr[2] = "30";


            //in mang ra man hinh
//        for (int i = 0; i< arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

        System.out.println(arr[0] + arr[1]); //noi chuoi ra 1020

        int number0 = Integer.valueOf(arr[0]).intValue();
        int number1 = Integer.valueOf(arr[1]).intValue();
        System.out.println(number0 + number1);
    }
}
*/


//Bai toan: Gan gia tri 1 cho mang co 5 phan tu
public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu thu : " + (i+1) + "la " + arr[i]);
        }

    }
}