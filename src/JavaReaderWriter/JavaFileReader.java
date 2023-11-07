package JavaReaderWriter;

import java.io.FileReader;

public class JavaFileReader {
    public static void main(String[] args) {
        char[] array = new char[100];

        try {
            FileReader input = new FileReader("input.txt");

            // đọc kí tự
            input.read(array);
            System.out.println("Du lieu trong file: ");
            System.out.println(array);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
