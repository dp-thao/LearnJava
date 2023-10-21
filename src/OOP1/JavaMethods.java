package OOP1;

public class JavaMethods {
    public int addNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        JavaMethods javaMethods = new JavaMethods();
        System.out.println("Tong la: " + javaMethods.addNumber(a, b));
    }
}
