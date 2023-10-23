package JavaList;

import java.util.Iterator;
import java.util.Vector;

class JavaVector {
    public static void main(String[] args) {
        Vector<String> mammals= new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);

        // Using get() : trả về một phần tử được chỉ định bởi chỉ mục
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        // Using iterator() : trả về một đối tượng iterator để truy cập tuần tự các phần tử vectơ
        Iterator<String> iterate = animals.iterator();
        System.out.print("Vector: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        // Using remove()
        String element1 = animals.remove(1);
        System.out.println("Removed Element: " + element1);
        System.out.println("New Vector: " + animals);

        // Using clear()
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
    }
}
