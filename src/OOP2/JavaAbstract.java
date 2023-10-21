package OOP2;

// Sử dụng từ khóa abstract để khai báo một lớp trừu tượng
abstract class JavaAbstract {
    JavaAbstract(){
        System.out.println("Đây là hàm tạo của lớp trừu tượng.");
    };
    // phương thức abstract
    abstract void method1();

    // phương thức thường
    void method2() {
        method1();
        System.out.println("Đây là phương thức thường.");
    }
}

abstract class Language {

    // method of abstract class
    public void display() {
        System.out.println("This is Java Programming");
    }
}

abstract class MotorBike {
    abstract void brake();
}

class SportsBike extends MotorBike {

    // implementation of abstract method
    public void brake() {
        System.out.println("SportsBike Brake");
    }
}

class MountainBike extends MotorBike {

    // implementation of abstract method
    public void brake() {
        System.out.println("MountainBike Brake");
    }
}

class Main extends JavaAbstract {
    public static void main(String[] args) {

        // create an object of Main
        Main obj = new Main();
        // access method of abstract class
        // using object of Main class
        obj.method2();

        // Tất cả các lớp con có cách triển khai khác nhau. Triển khai ở xe leo núi và xe thể thao là khác nhau.

        MountainBike m1 = new MountainBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }

    // Kế thừa lớp trừu tượng thì phải triển khai phương thức trừu tượng
    void method1() {
        System.out.println("Đây là triển khai phương thức trừu tượng.");
    }
}
