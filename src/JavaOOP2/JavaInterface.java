package JavaOOP2;

// Một interface
interface Polygon {
    // Đây là phương thức abstract (không có phần thân)
    // Mặc định ngầm định là public static final
    String type = "programming language";
    void getType();

    // Phạm vi truy cập mặc định ngầm định là public.
    void getVersion();

    void getArea(int length, int breadth);
    void getArea();

    // default method, các lớp con implement Polygon sẽ không cần triển khai phương thức này nữa, nhưng vẫn có thể truy
    // cập đến
    default void getSides() {
        System.out.println("I can get sides of a polygon.");
        PrivateMethod();
    }

    private void PrivateMethod() {
        System.out.println("Đây là phương thức có phạm vi truy cập private trong class interface.");
    }

}
// Một lớp abstract không bị bắt buộc override những phương thức của lớp cha interface
abstract class AbtractClass implements Polygon{
    public void Thao() { System.out.println("Dễ thương");}
}

// Kế thừa interface thì phải triển khai phương thức.
class Rectangle implements Polygon {
    @Override
    public void getType() {

    }

    @Override
    public void getVersion() {

    }

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }

    // Triển khai phương thức trừu tượng của interface
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }

    // overrides the getSides()
    public void getSides() {
        System.out.println("I have 4 sides.");
    }

    private void Thao() {

    }
}

class Square implements Polygon {
    @Override
    public void getType() {

    }
    @Override
    public void getVersion() {

    }

    @Override
    public void getArea(int length, int breadth) {

    }

    @Override
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }
}

class JavaInterface {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getArea(3,4);

        // create an object of Rectangle
        Rectangle r1 = new Rectangle();
        r1.getArea();
        r1.getSides();

        // create an object of Square
        Square s1 = new Square();
        s1.getArea();
        s1.getSides();
    }
}

