package JavaSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetInterface {

    public static void main(String[] args) {
//        Set set = new HashSet();
//        set.add(1);
//        System.out.println(set.contains(3));


        Set<String> setA = new HashSet<>();
        setA.add("element1");
        setA.add("element2");
        setA.add("element3");
        setA.add("element4");

        System.out.println(setA);

        // Triển khai HashSet
        ImplementHashSet();

        // Triển khai TreeSet
        ImplementTreeSet();




    }

    public static void ImplementHashSet() {
        // Triển khai HashSet
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: "+set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: "+set2);

        set1.addAll(set2);
        System.out.println("Set1: "+set1);
        set2.addAll(set1);
        System.out.println("Set2: "+set2);

        // Access Elements using iterator()
        System.out.print("Accessing elements using iterator(): ");
        Iterator iterator = set1.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(",");
        }
    }

    // Triển khai TreeSet
    public static void  ImplementTreeSet() {
        // Creating a set using the TreeSet class
        Set<Integer> numbers = new TreeSet<>();

        // Add elements to the set
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("Set using TreeSet: " + numbers);

        // Access Elements using iterator()
        System.out.print("Accessing elements using iterator(): ");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }

}
