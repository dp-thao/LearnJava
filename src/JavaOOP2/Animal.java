package JavaOOP2;

public class Animal {
    Animal() {
        System.out.println("Animal is superclass");
    }

    Animal(String type) {
        System.out.println("Type: " + type);
    }
    protected String type="animal";
    public void display(){
        System.out.println("I am an animal");
    }
}
