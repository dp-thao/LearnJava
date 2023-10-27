package JavaExceptionHanding;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JavaExceptionHanding {
    public static void main(String[] args) {
        try {
            // code that generates exception
            int divideByZero = 5 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        finally {
            System.out.println("This is the finally block");
        }

        divibeByZero();

        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    // throw exception
    public static void divibeByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }

    // khai báo loại ngoại lệ
    public static void findFile() throws IOException {
        // mã có thể tạo ngoại lệ
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}
