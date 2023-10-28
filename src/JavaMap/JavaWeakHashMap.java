package JavaMap;

import java.util.HashMap;
import java.util.WeakHashMap;

public class JavaWeakHashMap {
    public static void main(String[] args) {
        //WeakHashMap creation with capacity 8 and load factor 0.6
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>(8, 0.6f);

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("WeakHashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("WeakHashMap after garbage collection: " + numbers);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());

        // kiểm tra garbage của HashMap
        //weakhashmap();


    }

    public static void weakhashmap() {
        // Creating HashMap of even numbers
        HashMap<String, Integer> numbers = new HashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("HashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        // việc đặt biến tham chiếu two thành null không ảnh hưởng đến HashMap. Garbage collector không loại bỏ phần tử trong HashMap vì vẫn có một tham chiếu từ key "two" đến giá trị của nó.
        System.gc();

        System.out.println("HashMap after garbage collection: " + numbers);
    }
}
