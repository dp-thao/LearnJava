package JavaOOP2;

public class Dog extends Animal {
    public String type="mammal";

    Dog() {
        super("Animal");
        System.out.println("Dog is subclass");
    }

    @Override
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){
        display();
        super.display();
    }

    public void printType() {
        System.out.println(type);
        // Truy cập thuộc tính của lớp cha
        System.out.println(super.type);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printMessage();
        dog1.printType();
    }


}
