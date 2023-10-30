package JavaQueue;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class JavaArrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

        // chèn phần tử: add() và offer()
        //add(): ném ra ngoại lệ nếu hàng đợi đầy
        animals.add("Dog");
        // offer(): trả về false nếu hàng đợi đầy
        animals.offer("Cat");
        animals.offer("Bird");
        animals.offer("Elephant");
        animals.offer("Cat");

        System.out.println("animals: " + animals);

        // các phần tử truy cập:
        System.out.println("peek(): " + animals.peek());

        // iterator()
        Iterator<String> iterator = animals.iterator();
        System.out.print("Danh sach: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }

        // xóa phần tử
        // remove(): xóa phần tử, ném ra ngoại lệ nếu hàng đợi trống
        // pool(): xóa phần tử, trả về null nếu hàng đợi trống
        // clear(): xóa tất cả hàng đợi

        // phương thức put() và take()
        // put(): thêm phần tử vào cuối hàng đợi. Nếu hàng đợi chặn mảng đã đầy, nó sẽ đợi cho đến khi có khoảng trống
        //trong hàng đợi chặn mảng để thêm phần tử.
        try {
            // Add elements to animals
            animals.put("Fish");
            animals.put("Bee");
            System.out.println("\nArrayBlockingQueue: " + animals);
        }
        catch(Exception e) {
            // không nhảy vào exception vì đợi hàng đợi có khoảng trống để thêm phần tử khi hàng đợi đầy
            System.out.println(e);
        }
        // take(): xóa phần tử, Nếu hàng đợi chặn mảng trống, nó sẽ đợi cho đến khi có các phần tử trong hàng đợi chặn
        // mảng bị xóa.
        try {
            //Add elements to animals
            animals.put("Fish");
            animals.put("Bee");
            System.out.println("ArrayBlockingQueue: " + animals);

            // Remove an element
            String element = animals.take();
            System.out.println("Removed Element: " + element);
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }
}
