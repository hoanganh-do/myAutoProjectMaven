package com.BasicJava;

//bien la de luu lai mot gia tri nao do thuoc mot kieu du lieu nao do
//bien local la chi nam cuc bo trong class/phuong thuc
//bien static la bien o trong class nhung ngoai phuong thuc == bien instance nhung voi tu khoa static, chi co ham nao khai bao voi tu khoa static thi moi co the su dung duoc bien khai bao static

//class Bien {
//    public String name = "Auto"; //bien instance (toan cuc) la bien nam trong mot class nhung o ben ngoai cac ham
//    public String ten;
//
//    public void getInfo() {
//        int age = 10; //bien local (cuc bo) la bien nam trong mot class va mot ham, pham vi su dung chi o trong ham do va bat buoc phai khoi tao cung voi gia tri di kem neu ko se bao loi khi bien dich
//    }
//}

public class Variable {
    public String name0 = "A";
    public String name1;
    String name2;

    /*public*/ int age = 25; //int phải là số nguyên ko thể là kiểu số thực

    public float weight = 40.1f; //float đc để cả hai kiểu số nguyên và thực

    public boolean sex = true; //giới tính là nam

    public static String name3 = "Mía";


    public void getName() {
        System.out.println("Name is :" + name1);
        System.out.println("Name is :" + name2);
    }

    public void getAge() {
        System.out.println("Age is :" + age);

    }

    public static void main(String[] args) {
        int n = 10;
        String name = "HA";

        System.out.println("localVariable = " + n);
        System.out.println(name);
        //System.out.println("Name is : " + name1);
        System.out.println("Name is : " + name3);
    }
}

