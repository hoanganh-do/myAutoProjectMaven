package com.javabasic1;

import com.autotest.*;  //để import các package vào với nhau để sử dụng được các hàm của nhau


class TestClass {
    public int number1 = 10;
    public int number2 = 20;

    public int Cong (int a, int b) {
        return a+b;
    }

    public void In(int a, int b) {

        System.out.println(Cong(a,b));
    }
}

public class ClassAndObject {

    public static void main(String[] args) {
        int a = 2;
        int b = 6;

        //Khởi tạo 1 object thuộc 1 class
        TestClass objectClass = new TestClass();
        objectClass.Cong(a,b); //Cách gọi ra các thành phần trong 1 class thông qua object
        objectClass.In(a,b);

    }

}
