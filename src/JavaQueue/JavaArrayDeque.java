package JavaQueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class JavaArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> animals = new ArrayDeque<>();
        ArrayDeque<Integer> ages = new ArrayDeque<>();

        animals.add("Dog");
        animals.addFirst("Cat");
        animals.addLast("Duck");
        animals.addFirst("Elephant");
        System.out.println("animals: " + animals);

        ages.offer(3);
        ages.offerFirst(4);
        ages.offerLast(1);
        System.out.println("ages: " + ages);

        // truy cập các phần tử
        // getFirst(): trả về phần tử đầu tiên
        System.out.println("Trả về phần tử đầu tiên: " + animals.getFirst());
        System.out.println("Trả về phần tử đầu tiên: " + ages.getFirst());

        // getLast(): trả về phần tử cuối cùng
        System.out.println("Trả về phần tử cuối cùng: " + animals.getLast());
        System.out.println("Trả về phần tử cuối cùng: " + ages.getLast());

        // truy cập các phần tử
        // peek() trả về phần tử đầu tiên của mảng deque
        System.out.println("Trả về phần tử đầu tiên peek(): " + animals.peek());
        System.out.println("Trả về phần tử đầu tiên peek(): " + ages.peek());

        // peekFirst() trả về phần tử đầu tiên (= peek())
        System.out.println("peekFirst() trả về phần tử đầu tiên: " + animals.peekFirst());
        System.out.println("peekLast() trả về phần tử đầu tiên: " + animals.peekLast());

        // loại bỏ phần tử
        // remove() trả về và xóa 1 phần tử đầu tiên
        // remove(element) trả về và xóa 1 phần tử đã chỉ định khỏi phần đầu của mảng deque
        System.out.println("remove(element): " + animals.remove("Dog"));
        System.out.println("remove(element): " + animals.remove("Bird"));

        // loại bỏ phần tử
        // poll(), pollFirst(), pollLast()

        //Lặp lại ArrayDeque
        animals.add("Bird");
        animals.addFirst("Pig");
        System.out.print("Lặp danh sách for(): ");
        for(String animal : animals) {
            System.out.print(animal + ", ");
        }
        ages.add(2);
        ages.addFirst(8);
        ages.add(9);
        ages.addFirst(9);
        System.out.print("\nLặp danh sách iterator(): ");
        Iterator<Integer> iterator = ages.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
        System.out.print("\nLặp danh sách descendingIterator() ngược lại: ");
        Iterator<Integer> iterator1 = ages.descendingIterator();
        while(iterator1.hasNext()) {
            System.out.print(iterator1.next());
            System.out.print(", ");
        }

        // các phuơng thức khác
        // element() trả về phần tử từ phần đầu của mảng
        System.out.println("\nelement(): " + animals.element());

        // contains(element)
        System.out.println("contains() - Dog: " + animals.contains("Dog"));
        System.out.println("contains() - Duck: " + animals.contains("Duck"));

        // size()
        System.out.println("size(): " + animals.size());

        // toArray()
        String[] arrayAnimals = animals.toArray(new String[animals.size()]);
        System.out.print("toArray(): " );
        for(String animal : arrayAnimals) {
            System.out.print(animal + ", ");
        }
    }

}
