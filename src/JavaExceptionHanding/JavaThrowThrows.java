package JavaExceptionHanding;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//  Java throws Keyword
public class JavaThrowThrows {
//    public static void findFile() throws IOException {
//        // code that may produce IOException
//        File newFile = new File("test.txt");
//        FileInputStream stream=new FileInputStream(newFile);
//    }

//    public static int divide(int dividend, int divisor) throws IOException {
//        if (divisor == 0) {
//            throw new ArithmeticException("Khong the chia cho 0");
//        }
//        return dividend / divisor;
//    }

    public static void findFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try{
            findFile();
            divide(5, 0);
        } catch(IOException e){
            System.out.println("co loi: " + e.getMessage());
        }

        // chuyển tiếp ngoại lệ lên phía trên để xử lý
        try {
            doSomeWork();
        } catch (Exception e) {
            System.out.println("Exception handled in main method: " + e.getMessage());
        }
    }

    public static void doSomeWork() {
        try {
            divide(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException xử lý trong doSomeWork method: " + e.getMessage());
            throw new RuntimeException("Custom Exception");
        }
    }

    public static void divide(int dividend, int divisor) {
        if(divisor == 0) {
            throw new ArithmeticException("Khong the chia cho 0");
        }
    }
}
