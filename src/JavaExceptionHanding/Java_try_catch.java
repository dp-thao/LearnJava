package JavaExceptionHanding;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Java_try_catch {
    public static void main(String[] args) {
        try{
            int divideByZero = 5/0;
        }
        catch (RuntimeException r) {
            System.out.println(r.getMessage());
        }
        finally {
            System.out.println("Finally block is always executed");
        }

        ListOfNumbers list = new ListOfNumbers();
        list.writeList();
    }
}

class ListOfNumbers {
    // tạo mảng int
    int[] list = {1, 4, 3, 2, 5};
    // phương thức ghi dữ liệu từ mảng vào file
    public void writeList() {
        PrintWriter out = null;
        try {
            System.out.println("Entering try statement");
            // tạo mới một file OutputFile.txt
            out = new PrintWriter(new FileWriter("OutputFile.txt"));

            // viết giá trị từ mảng danh sách vào Output.txt
            for (int i = 0; i < 7; i++) {
                out.println("Value at: " + i + " = " + list[i]);
            }
        }
        catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }
        finally {
            int chia = 4/0; // gặp ngoại lệ thì những dòng code sau sẽ không được thực thi.

            // checking if PrintWriter has been opened
            if (out != null) {
                System.out.println("Closing PrintWriter");
                // close PrintWriter
                out.close();
            }
            else {
                System.out.println("PrintWriter not open");
            }

        }
    }
}
