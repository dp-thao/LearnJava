package JavaSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JavaAlgorithms {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);

        // sort: sắp xếp
        Collections.sort(arrayList);
        System.out.println("Sắp xếp sort: " + arrayList);

        // shuffle()
        Collections.shuffle(arrayList);
        System.out.println("shuffle(): " + arrayList);

        // Using reverse: đảo ngược thứ tự các phần tử
        Collections.reverse(arrayList);
        System.out.println("Reversed ArrayList1: " + arrayList);

        // Using swap(): hoán đổi vị trí 2 phần tử
        Collections.swap(arrayList, 0, 1);
        System.out.println("ArrayList1 using swap(): " + arrayList);

        // Using fill(): thay thế mọi phần tử trong bộ sưu tập bằng giá trị được chỉ định
//        Collections.fill(arrayList, 0);
//        System.out.println("ArrayList1 using fill(): " + arrayList);

        // trong khi thực hiện copy() thì cả hai danh sách phải có cùng kích thước.

        // Using binarySearch()
        int pos = Collections.binarySearch(arrayList, 3);
        System.out.println("The position of 3 is " + pos);

        // còn nhiều phương thức khác
    }


}
