package JavaExceptionHanding;

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

    public static void main(String args[]) {
        JavaAnnotationTypes obj = new JavaAnnotationTypes();

        List<String> universityList = Arrays.asList("Tribhuvan University", "Kathmandu University");
        obj.displayList(universityList);

        List<String> programmingLanguages = Arrays.asList("Java", "C");
        obj.displayList(universityList, programmingLanguages);
    }
}
