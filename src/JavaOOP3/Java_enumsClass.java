package JavaOOP3;

// Java enum
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize() {

        // this will refer to the object SMALL
        switch (this) {
            case SMALL:
                return "small";

            case MEDIUM:
                return "medium";

            case LARGE:
                return "large";

            case EXTRALARGE:
                return "extra large";

            default:
                return null;
        }
    }
}
class Test {
    Size pizzaSize;
    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    // Java Enum with the switch statement
    public void orderPizza() {
        switch(pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small size pizza.");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium size pizza.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }
}

public class Java_enumsClass {
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);

        Test t1 = new Test(Size.MEDIUM);
        t1.orderPizza();

        // Vì Size là một lớp enum nên trình biên dịch sẽ tự động tạo các phiên bản cho từng hằng số enum.
        // call getSize()
        // using the object SMALL
        System.out.println("The size of the pizza is " + Size.SMALL.getSize());
        System.out.println("Vị trí: " + Size.MEDIUM.ordinal());
        // phương thức so sánh các hằng số enum dựa trên giá trị thứ tự của chúng
        System.out.println("So sánh: " + Size.MEDIUM.compareTo(Size.LARGE));
        // phương thức trả về biểu diễn chuỗi của hằng số enum
        System.out.println("Chuỗi: " + Size.MEDIUM.toString());
        // phương thức trả về tên đã xác định của hằng số enum ở dạng chuỗi
        // giá trị trả về từ phương thức name() là final
        System.out.println("Enum name(): " + Size.MEDIUM.name());
        // lấy một chuỗi và trả về một hằng số enum có cùng tên chuỗi
        System.out.println("Enum valueOf(): " + Size.valueOf("SMALL"));
        // trả về một mảng kiểu enum chứa tất cả các hằng số enum
        Size[] enumArray = Size.values();
        System.out.println("Enum values(): " + enumArray);
        // = System.out.println("Enum values(): " + Size.values());
    }
}
