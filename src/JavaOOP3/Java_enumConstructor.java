package JavaOOP3;

// enum Constructor
enum SizeClass {

    // enum constants calling the enum constructors
    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    private final String pizzaSize;

    // private enum constructor
    private SizeClass(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}


public class Java_enumConstructor {
    public static void main(String[] args) {
        SizeClass size = SizeClass.SMALL;
        System.out.println(size.getSize());
    }
}
