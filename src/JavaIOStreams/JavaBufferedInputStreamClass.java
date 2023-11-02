package JavaIOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class JavaBufferedInputStreamClass {
    public static void main(String[] args) {
        try {
            // tạo lớp bufferedInputStream
            // 1. tạo fileinputstream
            FileInputStream file = new FileInputStream("input.txt");
            // 2. tạo bufferedInputStream
            // bộ đệm trong có kích thước 8192 byte.
            // có thể chỉ định kích thước của bộ đêm trong. các đệm sẽ giúp đọc byte từ các tập tin nhanh hơn
            // BufferedInputStream buffer = new BufferedInputStream(file, int size);
            BufferedInputStream buffer = new BufferedInputStream(file);

            // trả về số byte có thể đọc
            System.out.println("Available bytes at the beginning: " + buffer.available());
            // đọc byte
            buffer.read();
            buffer.read();
            buffer.read();
            // trả về số byte có thể đọc
            System.out.println("Available bytes at the end: " + buffer.available());

            // Skips the 5 bytes
            buffer.skip(5);
            System.out.println("Input stream after skipping 5 bytes:");

            // các phương thức
            // read(), read(byte[] arr), read(byte[] arr, int start, int length)
            // đọc byte đầu tiên từ file
            int i = buffer.read();

            while(i != -1) {
                System.out.print((char)i);

                // đọc byte tiếp theo
                i = buffer.read();
            }

            buffer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
