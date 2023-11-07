package JavaReaderWriter;

import java.io.FileReader;
import java.io.Reader;

public class JavaReader {
    public static void main(String[] args) {

        char[] array = new char[100];
        try {
            // tao 1 reader su dung FileReader
            Reader input = new FileReader("input.txt");

            // kiem tra neu reader
            System.out.println("Co du lieu trong luong khong? " + input.ready());

            // doc characters
            input.read(array);
            System.out.println("Du lieu trong stream:");
            System.out.println(array);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
