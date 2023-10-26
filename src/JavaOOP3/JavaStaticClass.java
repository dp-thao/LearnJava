package JavaOOP3;

// Java Nested Static Class
class Animal {
    // inner class
    class Reptile {
        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }

    // static class
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal.");
        }
    }

    public void eat() {
        System.out.println("I eat food.");
    }
}

public class JavaStaticClass {
    public static void main(String[] args) {
        // object creation of the outer class
        Animal animal = new Animal();

        // object creation of the non-static class
        Animal.Reptile reptile = animal.new Reptile();
        reptile.displayInfo();

        // object creation of the static nested class
        Animal.Mammal mammal = new Animal.Mammal();
        mammal.displayInfo();
        // mammal.eat(); // Lỗi: bởi vì mammal là đối tượng của lớp tĩnh và không thể truy cập các phương thức không tĩnh từ lớp tĩnh.

    }
}

// Chỉ các lớp lồng nhau mới có thể có static. Không thể có static top-level classes.
//static class Animal {
//    public static void displayInfo() {
//        System.out.println("I am an animal");
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Animal.displayInfo();
//    }
//}
