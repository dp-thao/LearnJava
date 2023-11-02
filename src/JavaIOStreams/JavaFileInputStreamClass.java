package JavaIOStreams;

import java.io.FileInputStream;

public class JavaFileInputStreamClass {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("input.txt");
            String string = "This is a line of text inside the file.";
            System.out.println("Chiều dài chuỗi: " + string.length());
            System.out.println(string);

            // Returns the number of available bytes
            System.out.println("Available bytes at the beginning: " + input.available());

            // Reads 3 bytes from the file
//            input.read();
//            input.read();
//            input.read();

            // Returns the number of available bytes
            System.out.println("Available bytes at the end: " + input.available());

            // Skips the 5 bytes
            input.skip(5);
            System.out.println("Input stream after skipping 5 bytes:");

            // phương thức khác
            // finalize()	đảm bảo rằng close()phương thức được gọi
            // getChannel()	trả về đối tượng được FileChannelliên kết với luồng đầu vào
            // getFD()	trả về bộ mô tả tệp được liên kết với luồng đầu vào
            // mark() 	đánh dấu vị trí trong luồng đầu vào mà dữ liệu đã được đọc
            // reset() 	trả điều khiển về điểm trong luồng đầu vào nơi đánh dấu được đặt

//            System.out.println("Data in the file: ");
            // Reads the first byte
            int i = input.read();
            while(i != -1) {
                System.out.print((char)i);

                // Reads next byte from the file
                i = input.read();
            }

            input.close();


        } catch (Exception e) {
            e.getStackTrace();
            e.printStackTrace();
        }
    }
}
