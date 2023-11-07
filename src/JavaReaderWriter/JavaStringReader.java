package JavaReaderWriter;

import java.io.StringReader;

public class JavaStringReader {
    public static void main(String[] args) {
        String data = "Toi song nhu mot doa hoa, toa ngat huong thom cho doi";
        //tao mang ki tu
        char[] array = new char[100];

        try {
            // tao StringReader
            StringReader input = new StringReader(data);

            input.skip(8);

            // su dung phuong thuc read
            input.read(array);
            System.out.println("Du lieu doc tu String: ");
            System.out.println(array);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
