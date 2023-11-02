package JavaIOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JavaFileOutputStreamClass {
    public static void main(String[] args) { //  throws FileNotFoundException

        String data = "This is a line of text inside the file.";

        try {
            // Including the boolean parameter
            // true, dữ liệu mới sẽ được thêm vào cuối dữ liệu hiện có trong tệp.
            // Nếu không, dữ liệu mới sẽ ghi đè lên dữ liệu hiện có trong tệp.
            FileOutputStream output = new FileOutputStream("output.txt", true);

            // Not including the boolean parameter
//        FileOutputStream output = new FileOutputStream("output.txt");
            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();

        } catch (Exception e) {
            e.getStackTrace();
            e.printStackTrace();
        }

        FileOutputStream out = null;
        String data1 = "This is demo of flush method";

        try {
            out = new FileOutputStream(" flush.txt");

            // Using write() method
            out.write(data1.getBytes());

            // Using the flush() method
            out.flush();
            out.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }

    }
}
