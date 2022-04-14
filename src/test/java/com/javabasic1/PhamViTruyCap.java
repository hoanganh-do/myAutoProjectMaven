package com.javabasic1;

class A_private {
    //khai báo private chỉ dùng trong cùng class chứ ko cho ngoài class sử dụng được
    private int number = 40;

    private void msg() {
        System.out.println("Heelo java");
    }
}


public class PhamViTruyCap {
    //khai báo protected chỉ được gọi qua package khác thông qua tính kế thừa bằng từ khóa extends tên_class có chứa các thành phần muốn gọi
    protected void msg() {
        System.out.println("Heelo");
    }

    public int cong2So (int a, int b) {
        return a+b;
    }

    public static void main (String args[]) {
        A_private obj = new A_private();
        //System.out.println(obj.data); //compile time error
        //obj.msg(); //compile time error

    }
}

//khai báo default thì chỉ cho phép sử dụng trong cùng 1 package, 1 package thì có nhiều class có thể sử dụng lẫn nhau thoải mái
//thuộc tính là mấy cái biến, phương thức là hàm, từ khóa static là để dùng chung cho tất cả các đối tượng
//khởi tạo class chung thì bỏ từ khóa public
//tính kế thừa là qua từ khóa extends, viết bao nhiêu hàm trong một class cũng được xong qua bên khác thì chỉ cần gọi lại cái hàm đấy để bố trí source cho nó hợp lý, ví dụ như có class 'tính toán' chứa các hàm +-*: vào trong 1 hàm, class 'in ấn thông báo' chứa các hàm in ra các tbáo rồi khi mình cần cái nào thì chỉ cần lấy cái object tại class đó