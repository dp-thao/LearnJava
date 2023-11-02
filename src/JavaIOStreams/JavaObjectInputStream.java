package JavaIOStreams;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class JavaObjectInputStream {
    public static void main(String[] args) {
        try {
            // tạo file
            FileInputStream fileStream = new FileInputStream("input.txt");
            // tạo đối tượng
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            // giống với ObjectOutputStream
        } catch (Exception e) {

        }
    }
}
