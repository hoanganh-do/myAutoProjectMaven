package com.javabasic1;

class Student {

    public String name;
    public int age;
    public float height;

    public static String universityName = "Kteam Education";
    public static int total = 0; //từ khóa static là khi khởi tạo đối tượng lần đầu tiên thì total đã = 1, rồi lại khởi tạo đối tượng b thì nó lại +1 = 2, còn nếu k có static thì nó sẽ không tăng cộng thêm lên (biến toàn cục sử dụng chung cho tất cả, kiểu cộng dồn vào)

    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }
}
public class Static {
    public static void main(String[] args) {
        Student a = new Student("Chau", 21, 1.7f);
        System.out.println("University (from class):" + Student.universityName);
        System.out.println("University (from instance):" + a.universityName);
        System.out.println("Total (from class):" + Student.total);

        Student b = new Student("Long", 24, 1.7f);
        System.out.println("Total (from instance):" + b.total);

    }
}
