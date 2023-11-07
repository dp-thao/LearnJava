package JavaReaderWriter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

import static java.nio.charset.StandardCharsets.UTF_16;

public class JavaOutputStreamWriterClass {
    public static void main(String[] args) {
        String data = "Manh me kien tri va phat trien";
        try {
            FileOutputStream file = new FileOutputStream("output.txt");

            OutputStreamWriter output = new OutputStreamWriter(file, Charset.forName("UTF16"));
            System.out.println("Character encoding of output2: " + output.getEncoding());
            output.write(data);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
