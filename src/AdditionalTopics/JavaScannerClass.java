package AdditionalTopics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class JavaScannerClass {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println(name);

//        fileScanner();
        inputStreamFile();
    }


    public static void fileScanner() {
        File file = new File("file.txt");
        try (Scanner scanner1 = new Scanner(file)) {
            while (scanner1.hasNext()) {
                String line = scanner1.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy tệp");
        }
    }

    public static void inputStreamFile() {
        // Khởi tạo đối tượng InputStream (chẳng hạn System.in)
        InputStream inputStream = System.in;
        // Tạo đối tượng Scanner để đọc từ InputStream
        Scanner sc1 = new Scanner(inputStream);
        System.out.println("Nhập một chuỗi");
        // Đọc chuỗi từ InputStream
        String input = sc1.nextLine();

        System.out.println("Bạn đã nhập: " + input);

        // Đóng Scanner khi đã hoàn thành
        sc1.close();
    }
}
