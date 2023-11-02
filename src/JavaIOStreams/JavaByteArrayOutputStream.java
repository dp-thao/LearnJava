package JavaIOStreams;

import java.io.ByteArrayOutputStream;

public class JavaByteArrayOutputStream {
    public static void main(String[] args) {
        String data = "This is a line of text inside the string.";

        // Creating a ByteArrayOutputStream with specified size
//        ByteArrayOutputStream out = new ByteArrayOutputStream(int size); // size : chiều dài mảng

        try {
            // Creates a ByteArrayOutputStream with default size
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = data.getBytes();

            // Writes data to the output stream
            out.write(array);

            // Retrieves data from the output stream in string format
            String streamData = out.toString();
            System.out.println("Output stream: " + streamData);

            System.out.print("Mảng: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }

            out.close();

            // phương thức khác
            // size() 	trả về kích thước của mảng trong luồng đầu ra
            // flush() 	xóa luồng đầu ra
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
