package JavaMap;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class JavaConcurrentHashMap {
    public static void main(String[] args) {
//        method1();
        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>(2, 0.7f);
        numbers.put("mot", 1);
        numbers.put("ba", 3);
        numbers.put("nam", 5);
        numbers.put("bay", 7);
        System.out.println(numbers);

        // Bulk ConcurrentHashMap Operations
        // forEach()
//        System.out.println("Su dung for: ");
//        numbers.forEach(1, (k, v) -> System.out.println("key: " + k + ", value: " + v));
//
//        numbers.forEach(1, (k, v) -> v, (v) -> System.out.print(v + ", "));

        numbers.forEach((k, v) -> {
            v += 1;
            System.out.print(v + ", ");
        });

        int sum = numbers.reduce(3, (k, v) -> v, (v1, v2) -> v1 + v2);
        System.out.println("\nSum of all values: " + sum);


    }

    public static void method1() {
        // Creating a hashmap of even numbers
        HashMap<String, Integer> evenNumbers = new HashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("HashMap: " + evenNumbers);

        ConcurrentHashMap<String, Integer> number = new ConcurrentHashMap<>();
        number.put("one", 1);
        number.put("two", 2);
        number.put("three", 3);
        System.out.println(number);

        // Creating a concurrent hashmap from other map
        ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("ConcurrentHashMap: " + numbers);
    }
}
