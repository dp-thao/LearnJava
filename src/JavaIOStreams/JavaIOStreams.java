package JavaIOStreams;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class JavaIOStreams {
    public static void main(String[] args) {
        byte[] array = new byte[100];
        try {
            InputStream input = new FileInputStream("input.txt");

            System.out.println("Available bytes in the file: " + input.available());

            // đọc byte từ input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(array);
            System.out.println(data);

            // Close the input stream
            input.close();

        } catch(Exception e) {

            // không tìm thấy tệp tin input.txt
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
