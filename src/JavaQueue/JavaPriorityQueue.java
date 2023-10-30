package JavaQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue();
    }

    public static void PriorityQueue() {
        // tạo hàng đợi ưu tiên
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // thêm các phần tử vào PriorityQueue
        numbers.add(2);
        numbers.offer(3);
        numbers.offer(4);
        numbers.add(1);
        System.out.println("hàng đợi ưu tiên: " + numbers);

        // truy cập phần tử
        // su dung peek() để truy cập đâu phân tử
        System.out.println("peek(): " + numbers.element());

        // su dung remove()
        System.out.println("peek(): " + numbers.remove(1));
        // su dung poll()
        System.out.println("poll(): " + numbers.poll());
        System.out.println("Queue sau khi xoa: " + numbers);

        // lặp hàng đợi ưu tiên
        // su dụng iterator()
        Iterator<Integer> iterator = numbers.iterator();
        System.out.print("PriorityQueue using Queue: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }

        // phuong thuc khac
        // contains(element)
        int numSearch = 3;
        if(numbers.contains(numSearch)) {
            System.out.println("\nCo chua: " + numSearch);
        } else {
            System.out.println("\nKhong chua: " + numSearch);
        }

        // tra ve do dai hang doi
        System.out.println("Do dai hang doi uu tien: " + numbers.size());

        // chuyen hang doi uu tien thanh mot mang
        // phuong thuc toArray() tra ve mot mang chua phan tu khong xac dinh
        Integer[] array = numbers.toArray(new Integer[numbers.size()]);
        // in mang
        System.out.print("Chuyen doi thanh array: ");
        for(Integer integer : array) {
            System.out.print(integer + ", ");
        }

        // So sanh
        PriorityQueue<Integer> numbers2 = new PriorityQueue<>(new CustomComparator());
        numbers2.add(4);
        numbers2.add(3);
        numbers2.add(7);
        numbers2.add(8);
        System.out.println("\n Priority: " + numbers2);
    }

    static class CustomComparator implements Comparator<Integer> {
        public int compare(Integer num1, Integer num2) {
            int value = num1.compareTo(num2);

            if(value > 0) {
                return  -1;
            } else if(value < 0) {
                return  1;
            } else {
                return 0;
            }
        }
    }

}
