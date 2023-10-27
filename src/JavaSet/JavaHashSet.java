package JavaSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaHashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(1);
        hashSet1.add(1);
        hashSet1.add(1);
        hashSet1.add(4);
        hashSet1.add(2);
        hashSet1.add(3);
        // Không theo thứ tự ban đầu, không có phần tử trùng lặp
        System.out.println("Số lượng phần tử: " + hashSet1.size() + "\nCác phần tử: " + hashSet1);

        // tham số thứ 1: dung lượng, chứa được 4 phần tử
        // tham số thứ 2: tỉ lệ nạp, khi nào bộ băm được lấp đầy 60%, các phần tử chuyển sang bảng băm mới có kích thước
        // gấp đôi bảng băm ban đầu.
        HashSet<Integer> hashSet2 = new HashSet<>(4, 6);
        hashSet2.add(6);
        hashSet2.add(8);
        hashSet2.add(9);
        hashSet2.add(5);
        System.out.println("Số lượng phần tử: " + hashSet2.size() + "\nCác phần tử: " + hashSet2);

        // truy cập các phần tử
        Iterator iterator = hashSet1.iterator();
        System.out.print("HashSet using Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }

        // Kết hợp 2 set
        hashSet1.addAll(hashSet2);
        System.out.println("\naddAll: " + hashSet1);
        System.out.println("hashSet2: " + hashSet2);

        Iterator iterator2 = hashSet1.iterator();
        System.out.print("HashSet using Iterator: ");
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next());
            System.out.print(", ");
        }

        // Giao giữa 2 tập hợp
        hashSet1.retainAll(hashSet2);
        System.out.println("\nIntersection is: " + hashSet1);

        // Sự khác biệt giữa 2 tập hợp
        System.out.println("\nhashSet1: " + hashSet1);
        System.out.println("hashSet2: " + hashSet2);
        hashSet2.removeAll(hashSet1);
        System.out.println("\nDifference is: " + hashSet2);
        hashSet1.removeAll(hashSet2);
        System.out.println("\nDifference is: " + hashSet1);
    }
}
