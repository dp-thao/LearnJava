package JavaReaderWriter;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class JavaInputStreamReaderClass {
    public static void main(String[] args) {
        char[] array = new char[100];
        try {
            FileInputStream file = new FileInputStream("Hanhphuc.txt");

            InputStreamReader input = new InputStreamReader(file);

            // Creates an InputStreamReader specifying the encoding
            // chỉ định mã hóa kí tự
            InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF8"));

            System.out.println("Character encoding of input2: " + input2.getEncoding());

            input.read(array);
            System.out.println("Data in the stream: ");
            System.out.println(array);

            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
