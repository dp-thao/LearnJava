package AdditionalTopics;

import java.util.ArrayList;

public class Java_autoboxing_and_unboxing {
    public static void main(String[] args) {
        int a = 23;
        // autoboxing
        Integer obj = a;

        ArrayList<Integer> nums = new ArrayList<>();

        // autoboxing
        nums.add(2);
        nums.add(3);

        // unboxing
        int num = nums.get(1);
        System.out.println(num);
    }
}
