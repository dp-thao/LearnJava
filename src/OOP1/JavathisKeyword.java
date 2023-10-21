package OOP1;

class JavathisKeyword {
    String instVar;
    private int a, b;

    // hàm tạo 1 tham số
    JavathisKeyword(String instVar) {
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    // hàm tạo 2 tham số
    private JavathisKeyword(int i, int j) {
        this.a = i;
        this.b = j;

        // value of x and y before calling add()
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.a + ", y = " + this.b);

//        JavathisKeyword javathisKeyword = new JavathisKeyword();
//        add(javathisKeyword);

        add(this);

        // value of a and b after calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.a + ", y = " + this.b);
    }
    // hàm tạo 1 tham số
    private JavathisKeyword(int i) {
        this(i, i);
    }
    // hàm tạo không tham số
    private JavathisKeyword() {
        this(0);
    }

    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }

    public class Main {
        public static void main( String[] args ) {
            JavathisKeyword obj = new JavathisKeyword(1, -2);
        }
    }

    void add(JavathisKeyword obi){
        obi.a += 2;
        obi.b += 2;
    }

    public static void main(String[] args) {
        JavathisKeyword obj = new JavathisKeyword("Thao");
        System.out.println("object reference = " + obj);

        // creating object of Complex class
        // calls the constructor with 2 parameters
        JavathisKeyword c1 = new JavathisKeyword(2, 3);

        // calls the constructor with a single parameter
        JavathisKeyword c2 = new JavathisKeyword(3);

        // calls the constructor with no parameters
        JavathisKeyword c3 = new JavathisKeyword();

        // print objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        JavathisKeyword thisExample = new JavathisKeyword(1, -2);
    }
}
