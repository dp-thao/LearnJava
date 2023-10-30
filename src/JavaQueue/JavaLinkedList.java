package JavaQueue;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");
        animals.add("Duck");
        animals.add("Duck");

        // thêm phần tử không có index parameter
        animals.add("Snake");
        // thêm phần tử có index parameter
        animals.add(1, "Elephant");
        System.out.println(animals);

        // truy cập các phần tử LinkedList
        // sử dụng phương thức get()
        System.out.println("Element at index 2: " + animals.get(2));

        // thay đổi các thành phần của LinkedList
        // sử dụng phương thức set()
        animals.set(3, "Turtle");
        System.out.println("Update LinkedList: " + animals.set(3, "Turtle"));
        System.out.println("Update LinkedList: " + animals);

        // xóa phần tử khỏi LinkedList
        // sử dụng phương thức remove()
        System.out.println("Remove element: " + animals.remove(2));
        System.out.println("Update LinkedList: " +animals);

        // kiểm tra linkedlist có chứa phần tử không
        System.out.println("contains(): " + animals.contains("Dog"));

        // trả về chỉ số lần xuất hiện đầu tiên của phần tử
        System.out.println("indexOf(): " + animals.indexOf("Duck"));

        // trả về chỉ số lần xuất hiện cuối cùng của phần tử
        System.out.println("lastIndexOf(): " + animals.lastIndexOf("Turtle"));

        // clear(): xóa bỏ tất cả phần tử

        // trả về một vòng lặp để lặp qua LinkedList
        System.out.print("Danh sách: ");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
    }
}
