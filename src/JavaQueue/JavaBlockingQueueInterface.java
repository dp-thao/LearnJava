package JavaQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class JavaBlockingQueueInterface {
    public static void main(String[] args) {
        // Array implementation of BlockingQueue
        BlockingQueue<String> animal1 = new ArrayBlockingQueue<>(5);
        BlockingQueue<Integer> ages = new LinkedBlockingQueue<>();

        // thêm phần tử
        animal1.add("Dog");
        animal1.add("Duck");
        animal1.add("Snack");
        animal1.add("Bee");
        System.out.println("animals: " + animal1);

        System.out.println("element(): " + animal1.element());

        // remove()

        // Phương thức trả về một số giá trị
        // offer(): chèn phần tử đã chỉ định vào blockingqueue
        System.out.println("offer(): " + animal1.offer("Bird"));
        System.out.println("animals: " + animal1);
        // peek(): trả ề phần đầu
        System.out.println("peek(): " + animal1.peek());
        // poll(): loại bỏ 1 phần tử khỏi hàng đợi


        // offer() and poll()
        try {
            String value = "Elephant";
            int timeoutMilliseconds = 100;
            boolean added = animal1.offer(value, timeoutMilliseconds, TimeUnit.MILLISECONDS);
            if (added) {
                System.out.println("Thêm thành công!");
            } else {
                System.out.println("Thêm thất bại");
                // vì số lượng giới hạn là 5 phần tử
            }
            System.out.println("animals: " + animal1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // put(): khi chèn một phần tử vào hàng đợi, nếu hàng đợi đầy, nó sẽ đợi cho đến khi hàng đợi có chỗ trống để
        //chèn một phần tử
//        try {
//            String value = "Elephant";
//            animal1.put(value);
//            // chờ đến khi hàng đợi có chỗ trống
//            System.out.println("animals: " + animal1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // take(): loại bỏ phần tử, nếu hàng đợi trống, thì take sẽ đợi khi hàng đợi chứa các phần tử cần xóa
        try {
            String value = animal1.take();
            System.out.println("Phần tử bị loại bỏ: " + value);
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
