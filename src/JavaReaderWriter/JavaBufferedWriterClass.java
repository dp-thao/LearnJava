package JavaReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class JavaBufferedWriterClass {
    public static void main(String[] args) {
        // du lieu de luu vao file
        String data = "Phat trien ban than tot hon tung ngay";

        try {
            // tao file
            FileWriter file = new FileWriter("output.txt");
            BufferedWriter buffer = new BufferedWriter(file);

            buffer.write(data);

            buffer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
