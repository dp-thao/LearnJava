package JavaMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class JavaLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> numbers1 = new LinkedHashMap<>();
        numbers1.put("one", 1);
        numbers1.put("two", 2);
        numbers1.put("three", 3);
        numbers1.put("four", 4);
        numbers1.put("three", 33);
        System.out.println(numbers1);

        LinkedHashMap<String, Integer> numbers2 = new LinkedHashMap<>(2, 0.75f, true);
        numbers2.put("five", 5);
        numbers2.put("six", 6);
        numbers2.put("three", 3);
        numbers2.put("seven", 7);
        System.out.println(numbers2);

        numbers2.get("six");
//        for (String key: numbers2.keySet()) {
//            System.out.println(key + ": " + numbers2.get(key));
//        }
        System.out.print("\nUse entry do for loop: ");
        for(Map.Entry<String, Integer> entry : numbers2.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }

        Iterator<Map.Entry<String, Integer>> iterator = numbers2.entrySet().iterator();
        System.out.print("\nUse entry do loop: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry);
            System.out.print(", ");
        }

        // Using putIfAbsent()
        numbers2.putIfAbsent("six", 10); // không thay đổi giá trị của key vì key trước đó đã tồn tại giá trị
        System.out.println("\nUpdated LinkedHashMap(): " + numbers2);

        // sử dụng entry
        System.out.println("Key/Value mappings: " + numbers2.entrySet());

        // Using get()
        int value1 = numbers2.get("three");
        System.out.println("Returned Number: " + value1);

        // Using getOrDefault(): Trả về giá trị được liên kết với khóa được chỉ định. Nếu không tìm thấy khóa, nó sẽ trả về giá trị mặc định đã chỉ định.
        int value2 = numbers2.getOrDefault("Five", 5);
        System.out.println("Returned Number: " + value2);

    }
}
