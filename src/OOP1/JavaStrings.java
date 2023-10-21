package OOP1;

public class JavaStrings {
    public static void main(String[] args) {

        // create strings
        String first = "Java";
        String second = "Python";
        String third = "JavaScript";

        // print strings
        System.out.println(first);   // print Java
        System.out.println(second);  // print Python
        System.out.println(third);   // print JavaScript

        JavaStrings javaStrings = new JavaStrings();
        lengthString();
        javaStrings.joinStrings();
        javaStrings.compareStrings();
    }

    // Tính chiều dài chuỗi
    public static void lengthString() { // static: gọi không cần thông qua đối tượng
        // create a string
        String greet = "Hello! World";
        System.out.println("String: " + greet);

        // get the length of greet
        int length = greet.length();
        System.out.println("Length: " + length);
    }

    // Nối chuỗi
    public void joinStrings() {
        // create first string
        String first = "Java ";
        System.out.println("First String: " + first);

        // create second
        String second = "Programming";
        System.out.println("Second String: " + second);

        // join two strings
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);
    }

    // So sánh chuỗi
    public void compareStrings() {
        // create 3 strings
        String first = "java programming";
        String second = "java programming";
        String third = "python programming";

        // compare first and second strings
        boolean result1 = first.equals(second);
        System.out.println("Strings first and second are equal: " + result1);

        // compare first and third strings
        boolean result2 = first.equals(third);
        System.out.println("Strings first and third are equal: " + result2);
    }

}
