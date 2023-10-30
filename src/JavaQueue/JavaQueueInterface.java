package JavaQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueueInterface {
    public static void main(String[] args) {
        QueueInterface();
    }

    public static void QueueInterface() {
        // Truy cập hàng đợi
        // LinkedList trien khai Queue
        Queue<Integer> numbers = new LinkedList<>();
        // ArrayDeque trien khai Queue
        Queue<String> animal2 = new ArrayDeque<>();
        // PriorityQueue trien khai Queue
        Queue<String> animal3 = new PriorityQueue<>();

        // them element
        numbers.add(1); // add() nếu hàng đợi đầy nó sẽ ném ra 1 ngoại lệ
        numbers.offer(2); // nếu hàng đợi đầy nó sẽ trả về false
        numbers.offer(3);
        numbers.offer(4);
        System.out.println("Queue: " + numbers);

        // truy cap phan tu
        // tra ve phan dau cua hang doi, nem ra ngoai le neu hang doi trong
        System.out.println("element(): " + numbers.element());
        // tra ve phan dau cua hang doi, tra ve null neu hang doi trong
        System.out.println("eek(): " + numbers.peek());
        //remove(): tra ve va xoa phan dau, neu trong thi nem ra ngoai le
        // poll(): tra ve va xoa phan dau, neu trong thi ra ve null

        // tao Queue su dung PriorityQueue class
        animal2.add("Dog");
        animal2.add("Cat");
        animal2.add("Snake");
        animal2.add("Duck");
        System.out.println("animal2: " + animal2);

        // truy cap phan tu cua Queue
        String accessedAnimal = animal2.element();
        System.out.println("element(): " + accessedAnimal);

    }
}
