package com.BasicJava;

public class ToanTu {

    public static void main(String[] args) {
        int $number1 = 10;
        int _number2 = 2;
        float number_3 = 3.3f;
        String name_string1 = "Mía";
        String name_string2 = "aa";

        boolean sex1 = true;
        boolean sex2 = false;

        //$number1++;
        //++$number1;
        //int number4 = $number1++; //trả về giá trị b trước rồi mới tăng a lên 1 đơn vị
        //int number4 = ++$number1; //tăng a lên 1 đơn vị trước rồi mới trả về giá trị của b
        //System.out.println(number4);


        //If-else
//        if ($number1 > 9) {
//            System.out.println("Right");
//        } else if ($number1 != 1) {
//            System.out.println("Nothing");
//        } else {
//            System.out.println("Wrong");
//        }

        //For-loop
        //int = 1 để khởi tạo giá trị biến chạy (chạy từ i = 1 đến điều kiện)
        //i <= 10 để giới hạn biến chạy i lại đến khi = 10
        //i++ để tăng i sau mỗi lần làm việc lên 1 giá trị cho đến khi thỏa mãn điều kiện thì dừng lại
        /*for (int i = 1; i <= 10; i++) {
            System.out.println("No: " + i);
            System.out.print("Hello world");
            System.out.println("Mía");
        }*/


            int temp = 2;

            for (int i = 1; i<= 10; i++) {

                if (i == temp) {
                    System.out.println("Đã bằng "+temp+" và dừng");
                    break;
                }

                System.out.println("Lần : " + i);
            }


    }

}
