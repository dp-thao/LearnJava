package AdditionalTopics;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class JavaLambdaExpression
{
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");

        animals.forEach(animal -> System.out.println("Hello " + animal));

        for (String animal: animals) {
            System.out.println("Hello: " + animal);
        }
    }
}
