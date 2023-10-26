package JavaOOP1;

public class Student extends Person {
    public static void main(String[] args) {

        // create an object of Dog class
        Student student = new Student();
        // access protected method
        student.sing();

        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
    }
    // Lỗi vì không ghi đề được phương thức final
//    public void FinalMethod() {
//
//    }

    // Ghi đè trong kế thừa
    @Override
    public void sing() {
        super.sing();
        System.out.println("Toi hat la la la...");
    }

    public void say() {
        System.out.println("Toi thich hat.");
    }
}
