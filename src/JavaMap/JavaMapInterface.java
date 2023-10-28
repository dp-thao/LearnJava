package JavaMap;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMapInterface {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);

        System.out.println(numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map, xóa theo key và trả về value
        int value = numbers.remove("two");
        System.out.println("Removed Value: " + value);

        // triển khai lớp Treemap
        TreeMap();
    }

    // Triển khai lớp TreeMap
    public static void TreeMap() {
        System.out.println();
        Map<String, Integer> numbers = new TreeMap<>();
        // Insert giá trị
        numbers.put("four", 4);
        numbers.put("six", 6);
        numbers.put("five", 5);
        System.out.println(numbers);

        // Replacing the values
        numbers.replace("First", 11);
        numbers.replace("Second", 22);
        System.out.println("New Map: " + numbers);

        // Remove elements from the map
        int removedValue = numbers.remove("four");
        System.out.println("Removed Value: " + removedValue);
    }
}
