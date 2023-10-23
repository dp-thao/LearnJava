package JavaList;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args){

        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList: " + languages);

        // get the element from the arraylist
        String lang = languages.get(1);
        System.out.print("Element at index 1: " + lang);

        // change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);

        // remove element from index 2
        String str = languages.remove(2);
        System.out.println("Updated ArrayList: " + languages);
        System.out.println("Removed Element: " + str);

        // iterate using for-each loop
        System.out.println("Accessing individual elements:  ");
        for(String item : languages) {
            System.out.print(item);
            System.out.print(", ");
        }
    }
}
