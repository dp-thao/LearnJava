package JavaOOP1;

// Class and Objects
public class Person {
    // field
    public String name;
    public int age;

    // method
    // sing() là phương thức tự định nghĩa
    public void sing() {
        System.out.println("La la la...");
    }

    public final void FinalMethod() {
        System.out.println("Đây là phương thức final.");
        Employee employee = new Employee();
        employee.say();
    }
}

