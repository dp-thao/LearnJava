package JavaSet;

import java.util.Comparator;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> number1 = new TreeSet<>();
        number1.add(2);
        number1.add(4);
        number1.add(2);
        number1.add(5);
        number1.add(3);
        System.out.println(number1);

        TreeSet<Integer> number2 = new TreeSet<>();
        number1.add(1);

        number1.addAll(number2);
        System.out.println("tập hợp number1: " + number1);

        // truy cập các phần tử: iterator()

        // xóa phần tử: remove() - removeAll() : trả về true or false

        // first()-trả về phần tử đầu tiên , end() - trả về phần tử cuối cùng
        int numFirst = number1.first();
        System.out.println("number1 first: " + numFirst);

        int numLast = number1.last();
        System.out.println("number1 last: " + numLast);

        // Using higher()
        System.out.println("Using higher: " + number1.higher(4));

        // Using lower()
        System.out.println("Using lower: " + number1.lower(4));

        // Using ceiling()
        System.out.println("Using ceiling: " + number1.ceiling(4));

        // Using floor()
        System.out.println("Using floor: " + number1.floor(3));

        // Using pollFirst()
        System.out.println("Removed First Element: " + number1.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + number1.pollLast());

        System.out.println("New TreeSet: " + number1);

        // Using headSet() with default boolean value
        System.out.println("Using headSet without boolean value: " + number1.headSet(5));

        // Using headSet() with specified boolean value
        System.out.println("Using headSet with boolean value: " + number1.headSet(5, true));

        // Using tailSet() with default boolean value
        System.out.println("Using tailSet without boolean value: " + number1.tailSet(4));

        // Using tailSet() with specified boolean value
        System.out.println("Using tailSet with boolean value: " + number1.tailSet(4, false));

        // Creating a tree set with a customized comparator
        TreeSet<String> animals = new TreeSet<>(new CustomComparator());

        animals.add("Dog");
        animals.add("Zebra");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("TreeSet: " + animals);

    }

    // Creating a comparator class
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String animal1, String animal2) {
            int value =  animal1.compareTo(animal2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
