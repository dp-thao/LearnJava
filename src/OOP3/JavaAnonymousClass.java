package OOP3;

// Anonymous Class Extending a Class
class Polygon {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousDemo {
    public void createClass() {

        // creation of anonymous class extending class Polygon
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class 1.");
            }
        };
        p1.display();
    }
}

// Anonymous Class Implementing an Interface
interface Polygon2 {
    public void display();
}

class AnonymousDemo2 {
    public void createClass() {

        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class 2.");
            }
        };
        p1.display();
    }
}

public class JavaAnonymousClass {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();

        AnonymousDemo2 an2 = new AnonymousDemo2();
        an2.createClass();
    }
}
