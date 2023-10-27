package JavaExceptionHanding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

// Java Annotation Types
public class JavaAnnotationTypes {
    @SafeVarargs
    private void displayList(List<String>... lists) {
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }

    // Các khai báo trên: Ví dụ về chú thích @SuppressWarnings
    @SuppressWarnings("unchecked")
    static void wordsList() {
        ArrayList wordList = new ArrayList<>();

        // This causes an unchecked warning
        wordList.add("programiz");

        System.out.println("Word list => " + wordList);
    }

    public static void main(String args[]) {
        JavaAnnotationTypes obj = new JavaAnnotationTypes();

        List<String> universityList = Arrays.asList("Tribhuvan University", "Kathmandu University");
        obj.displayList(universityList);

        List<String> programmingLanguages = Arrays.asList("Java", "C");
        obj.displayList(universityList, programmingLanguages);

    }
}
