package JavaOOP1;

public class JavaConstructor {
    int a;
    boolean b;
    private String name;
    private JavaConstructor() {
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public JavaConstructor(String name) {
        this.name = name;
        System.out.println(name + " la sinh vien");
    }

    public static void main(String[] args) {
        JavaConstructor obj = new JavaConstructor();
        System.out.println("The name is " + obj.name);

        JavaConstructor obj2 = new JavaConstructor("Thao");
        JavaConstructor obj3 = new JavaConstructor("Truong");
        JavaConstructor obj4 = new JavaConstructor("Linh");

        Constructor2 constructor2 = new Constructor2();
        System.out.println("Company name = " + constructor2.name);

        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}

class Constructor2 {
    String name;
    // private String name; // Lỗi phạm vi truy cập
    public Constructor2() {
        name = "Programiz";
    }
}
