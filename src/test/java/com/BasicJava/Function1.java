package com.BasicJava;

public class Function1 {

//    //ko tra ve(void)
//    static void min(int arr[]) {
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//            System.out.println(min);
//        }
//    }

    //tra ve(int)
    static int min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int no_void_arr[] = {3,5,7,1,9};
//      int arr1[] = new int[5];
//      int arrr2[] = new int[6];

        int bien2 = min(no_void_arr);
        System.out.println(bien2);

    }
}








//index cua mang la vi tri cua mot mang
//arr[index] la lay ra gia tri tai vi tri index
//void (ko tra ve) = khi minh goi cai ham do va ko the gan gia tri trong ham cho thang nao khac nua
//ko co void (in ra luon 1 gia tri cu the khi tra ve) = khi goi ten ham co nghia la lay gia tri trong ham do roi gan cho mot cai gi do nhu bien cha han