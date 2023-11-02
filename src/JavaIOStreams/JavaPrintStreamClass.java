package JavaIOStreams;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class JavaPrintStreamClass {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("output.txt");
            // tham số autoFlush: tham số tùy chọn, chỉ định có thực hiện tự xộng flush hay ko
            // charset : chỉ định mã hóa ký tự
            PrintStream output = new PrintStream(file, true, StandardCharsets.UTF_8);
            // các phương thức
            // print() - println()
            // printf() : được sử dụng để in chuỗi được định dạng. gồm 2 tham số: chuỗi được định dạng - đối số
            System.out.printf("I am %d years old", 22);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
