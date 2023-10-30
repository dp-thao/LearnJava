package JavaQueue;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class JavaLinkedBlockingQueue {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Integer> ages = new LinkedBlockingQueue<>(6);

        // thêm phần tử
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bee");
        animals.offer("Duck");
        System.out.println("animals: " + animals);

        // peek(): trả về phần tử đầu, null nếu hàng đợi trống
        System.out.println("peek(): " + animals.peek());

        // iterator():
        Iterator<String> iterator = animals.iterator();
        System.out.print("Danh sach lap iterator(): ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
        System.out.print("\nDanh sach lap for(): ");
        for(String animal: animals) {
            System.out.print(animal);
            System.out.print(", ");
        }

        // giống với arrayBloking các phương thức, khác nhau:
        // arrayBloking: bắt buộc cố định kích thước hàng đợi
        // linkedBloking: không bắt buộc cố định
        // trong một số trường hợp khi cố định kích thước hàng đợi sẽ giúp hoạt động nhanh hơn
    }
}
