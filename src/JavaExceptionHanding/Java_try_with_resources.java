package JavaExceptionHanding;

import java.io.*;
import java.util.Scanner;

public class Java_try_with_resources {
    public static void main(String[] args) throws IOException{
        String line;

        // dùng thể hiện của bufferedReader để đọc dữ liệu tử test.txt
        // khai báo và khởi tạo BufferedReader trong try-with-resources để đảm bảo được đóng dù lệnh try hoàn thành bình
        // thường hay ném ra một ngoại lệ.
        try (BufferedReader br = new BufferedReader(  new FileReader("test.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>" + line);
            }
        } catch(IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }

        // truy cập ngoại lệ bị loại bỏ
        try (MyAutoCloseable resource = new MyAutoCloseable()) {
            resource.doSomething();
            throw new Exception("Main exception");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable t : suppressed) {
                System.out.println("Suppressed: " + t.getMessage());
            }
        }

        // sử dụng try với nhiều resources
        try (Scanner scanner = new Scanner(new File("testRead.txt"));
             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }

        // Java 9: sử dụng tham chiếu scanner
        Scanner scanner = new Scanner(new File("testRead.txt"));
        try (scanner) {
            // code
        }
    }

    static class MyAutoCloseable implements AutoCloseable {
        // khi một phương thức thực hiện ném ngoại lệ bằng cách sử dụng throw new ExceptionType thì phải khai báo phương
        // thức đó có thể ném ngoại lệ bằng throws. Nếu không thì mã sẽ không được biên dịch.
        @Override
        public void close() throws Exception {
            throw new Exception("Closing exception");
        }

        public void doSomething() throws Exception {
            throw new Exception("Do something exception");
        }
    }
}
