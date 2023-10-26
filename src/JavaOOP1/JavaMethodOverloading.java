package JavaOOP1;
// Nạp chồng phương thức
public class JavaMethodOverloading {
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }
    // Thay đổi số lượng tham số
    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    // Thay đổi kiểu dữ liệu của tham số
    private static void display(String a){
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
        display("Hello");
    }
}
