package OOP1;


// Java_finalKeyword không kế thừa được FinalClass vì đây là class final
final class FinalClass {
    public void FinalMethod() {
        System.out.println("Đây là phương thức final.");
    }
}

public class Java_finalKeyword {

    public static void main(String[] args) {

        // create a final variable
        final int AGE = 32;

        // try to change the final variable
        // AGE = 45;
        System.out.println("Age: " + AGE);
    }
}
