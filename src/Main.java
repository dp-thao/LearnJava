// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    String hello = "Hello World!";
    int age = 20;
    int AGE = 21;

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Hello World:");
        main.HelloWorld();
        System.out.println("Kiểu dữ liệu:");
        main.DataTypes();
        main.Operators();
    }
    public void HelloWorld() {
        age = 22;
        System.out.println(hello);
        System.out.println("Tuổi của tôi là: " + age);
        System.out.println("Tuổi của tôi là: " + AGE);
    }

    // Data types
    public void DataTypes() {
        // boolean
        boolean flag = false;
        if (flag) {
            System.out.println("boolean: True");
        } else {
            System.out.println("boolean: False");
        }
        // byte
        byte range;
        range = 124;
        System.out.println("byte: " + range);
        // short
        short temperature;
        temperature = -200;
        System.out.println("short: " + temperature);
        // int
        int rangeInt = -4250000;
        System.out.println("int: " + rangeInt);
        // long
        long rangeLong = -42332200000L;
        System.out.println("long: " + rangeLong);
        // double
        double number = -42.3;
        System.out.println("double: " + number);
        // float
        float numberFloat = -42.3f;
        System.out.println("float: " + numberFloat);
        // char
        char letter = '\u0051';
        System.out.println("char: " + letter); // prints Q

        char letter1 = '9';
        System.out.println(letter1);  // prints 9

        char letter2 = 80;
        System.out.println(letter2);  // prints A
    }

    // Java Operators
    public void Operators() {
        // declare variables
        int a = 20, b = 3;
        System.out.println("Toán tử số học:");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));

        // create variables
        int c = 4;
        int var;
        System.out.println("Toán tử gán:");
        // assign value using =
        var = c;
        System.out.println("var using =: " + var);

        // assign value using =+
        var += c;
        System.out.println("var using +=: " + var);

        // assign value using =*
        var *= c;
        System.out.println("var using *=: " + var);

    }
}