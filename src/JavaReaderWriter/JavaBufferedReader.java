package JavaReaderWriter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class JavaBufferedReader {
    public static void main(String[] args) {
        char[] array = new char[100];
        try {
            FileReader file = new FileReader("input.txt");
            BufferedReader buffer = new BufferedReader(file);

            // skip()
            buffer.skip(5);

            // doc
            buffer.read(array);
            System.out.println("Du lieu trong file: ");
            System.out.println(array);

            // dong
            buffer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
