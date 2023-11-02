package JavaIOStreams;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JavaByteArrayInputStreamClass {
    public static void main(String[] args) {
        // Creates a ByteArrayInputStream that reads entire array
//        ByteArrayInputStream input = new ByteArrayInputStream(byte[] arr);

        // Creates a ByteArrayInputStream that reads a portion of array
//        ByteArrayInputStream input2 = new ByteArrayInputStream(byte[] arr, int start, int length);

        // Creates an array of byte
        byte[] array = {1, 2, 3, 4, 5, 6};

        try {

            ByteArrayInputStream input = new ByteArrayInputStream(array);

            // Returns the available number of bytes
            System.out.println("Available bytes at the beginning: " + input.available());

            // Reads 2 bytes from the input stream
            input.read();
            input.read();

            // Returns the available number of bytes
            System.out.println("Available bytes at the end: " + input.available());

            // Using the skip() method
            input.skip(2);
            System.out.print("Input stream after skipping 2 bytes: ");

            System.out.print("The bytes read from the input stream: ");

            for(int i= 0; i < array.length; i++) {

                // Reads the bytes
                int data = input.read();
                System.out.print(data + ", ");
            }
            input.close();

            //byteArray();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }

    public static void byteArray() {
        String data = "Hava a nice day";
        try {
            // Ghi dữ liệu vào file
//            FileOutputStream output = new FileOutputStream("happy.txt", true);
            FileOutputStream output = new FileOutputStream("happy.txt");
            byte[] array = data.getBytes();
            output.write(array);
            output.close();

            // Đọc dữ liệu từ file
            FileInputStream input = new FileInputStream("happy.txt");
            //mảng byte để chứa dữ liệu
            int length = input.available(); // lấy chiều dài chuỗi "Hava a nice day";
            byte[] byteArray = new byte[length];
            if (input.available() > 0) {
                int i = input.read();
                while(i != -1) {
                    // lưu dữ liệu vào mảng byteArray
                    for (int item = 0; item <= length; item++) {
                        byteArray[item] = (byte) input.read();
                    }
                    System.out.print((char)i);
                    // Reads next byte from the file
                    i = input.read();
                }
            }
            input.close();

            // Ghi dữ liệu vào mảng byte
            ByteArrayInputStream byteArrayInput = new ByteArrayInputStream(array);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
