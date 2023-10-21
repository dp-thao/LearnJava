package OOP2;

class Polygon1 {

    // method to render a shape
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

class Square1 extends Polygon1 {

    // renders Square
    public void render() {
        System.out.println("Rendering Square...");
    }
}

class Circle1 extends Polygon1 {

    // renders circle
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

public class JavaPolymorphism {
    public static void main(String[] args) {
// create an object of Square
        Square1 s1 = new Square1();
        s1.render();

        // create an object of Circle
        Circle1 c1 = new Circle1();
        c1.render();
    }
}
