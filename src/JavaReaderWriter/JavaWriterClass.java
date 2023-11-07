package JavaReaderWriter;

import java.io.FileWriter;
import java.io.Writer;

public class JavaWriterClass {
    public static void main(String[] args) {
        String data = "Toi hanh phuc vi toi hanh phuc";

        try {
            Writer output = new FileWriter("Hanhphuc.txt");
            output.write(data);

            output.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
