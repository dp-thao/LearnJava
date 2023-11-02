package Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


class People {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends People {
    private float gpa;

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Student(String name, int age, float gpa){
        super(name, age);
        this.gpa = gpa;
    }
}

public class CollectionsFramework  {

    public static void main(String[] args) {
        CollectionsSet();
    }

    public static void CollectionsSet() {
        HashSet<Student> students = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            String name = "name" + i;
            Student student = new Student(name, 22, 3);
            students.add(student);
        }
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            // xảy ra ngoại lệ
            System.out.println(iterator.next().getName() + " - " + iterator.next().getAge() + " - " + iterator.next().getGpa());
        }
    }
}
