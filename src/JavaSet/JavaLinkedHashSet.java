package JavaSet;

import java.util.*;

public class JavaLinkedHashSet {
    public static void main(String[] args) {

        // LinkedHashSet with 8 capacity and 0.75 load factor
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(8, 7);

        // LinkedHashSet with default capacity and load factor
        // Theo mặc định:
        //dung lượng của bộ băm được liên kết sẽ là 16
        //hệ số tải sẽ là 0,75
        LinkedHashSet<Integer> numbers1 = new LinkedHashSet<>();

        // Tạo LinkedHashSet từ các bộ sưu tập khác
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(2);
        System.out.println("ArrayList: " + arrayList);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(arrayList);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(1);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.addAll(arrayList);
        System.out.println("LinkedHashSet1: " + linkedHashSet);

        linkedHashSet1.stream().filter(l -> l ==4).findFirst();
        if(linkedHashSet1.contains(1)) {
            System.out.println(linkedHashSet1.contains(1));
        }


        // truy cập phần tử trong linkedhashset
        Iterator<Integer> iterator = linkedHashSet.iterator();
        Iterator<Integer> iterator1 = arrayList.iterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if(iterator.hasNext()) {
                int item1 = iterator.next();
                System.out.print(item1 + ", ");
            }
            System.out.print(item + ", ");
        }
    }
}
