package JavaMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<String, Integer> numbers = new HashMap<>();

        System.out.println("Initial HashMap: " + numbers);
        // put() method to add elements
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap after put(): " + numbers);

        // get() method to get value
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "C#");
        languages.put(3, "Python");
        String value = languages.get(1);
        System.out.println("Value at index 1: " + value);
        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + languages.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + languages.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + languages.entrySet());

        // change element with key 2
        languages.replace(2, "C++");
        System.out.println("HashMap using replace(): " + languages);

        // iterate through keys only
        System.out.print("Keys: ");
        for (Integer key : languages.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

       System.out.print("\nvalues: ");
        for(String valueItem : languages.values()) {
            System.out.print(valueItem);
            System.out.print(", ");
        }

        System.out.print("\nValue\\Key: ");
        for(Map.Entry<Integer,String> keyValue : languages.entrySet()) {
            System.out.print(keyValue);
            System.out.print(", ");
        }

    }
}
