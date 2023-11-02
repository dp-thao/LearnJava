package JavaIOStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class JavaBufferedOutputStreamClass {
    private static FileOutputStream file;

    public static void main(String[] args) {
        String data = "This is a line of text inside the file";

        try {
            FileOutputStream file = new FileOutputStream("output.txt");
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(file);

            // write()
            byte[] array = data.getBytes(); // getByte(): chuyển đổi 1 chuỗi thành 1 mảng byte

            // flush() : xóa bộ đệm trong, buộc luồng đầu ra ghi tất cả dữ liệu có trong bộ đệm vào tệp đích


            // viết dâta vào output stream
            bufferedOutput.write(array);

            // xóa dữ liệu đích đến
            bufferedOutput.flush();
            System.out.println("Data is flushed to the file");

            bufferedOutput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
