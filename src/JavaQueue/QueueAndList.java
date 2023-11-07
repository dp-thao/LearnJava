package JavaQueue;

import java.util.*;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

// create class Student
class Student {
    String name;
    int age;

    Student() {};
    Student(String name, int age) {}

    public void addStudent() {
        PriorityQueue<Student> students = new PriorityQueue<>();
        try {
            for (int i = 0; i < 5; i++) {
                String nameStudent = "name " + (i+1);
                Student student = new Student(nameStudent, 22);
                students.add(student);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


class QueueAndList {

    public static void arrayList() {

        // danh sách cha
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Đam mê");
        strings.add("Tộc độ");
        strings.add("Thành công");
        strings.add("Uy tín");
        strings.add("Cầu tiến");

        try
        {
            // subList() có thể ném ra ngoại lệ nếu 1 trong 2 giá trị nằm ngoài phạm vi,
            // chỉ số bắt đầu được chỉ định nhỏ hơn 0 hoặc chỉ số kết thúc lớn hơn kích thước ArrayList.
            // subList() trả về đối tượng của List thay vì của ArrayList, nếu cố gằng ép kiểu ArrayList thì sẽ xảy ra
            // ngoại lệ
            // sử dụng cách này là tạo liên kết trực tiếp, nếu thay đổi danh sách con hoặc cha thì sẽ thay đổi danh sách
            // còn lại.
//            List<String> sublist = strings.subList(0, 4);
            // Có thể sử dụng hàm tạo của ArrayList, sử dụng cách này (new ArrayList<>(strings.subList(0, 4))) là đã tạo
            // bản sao, bản sao này không liên kết với danh sách gốc ban đầu, thay đổi trong danh sách gốc không ảnh
            // hưởng đến danh sách con.
            // tạo danh sách con
            ArrayList<String> sublist = new ArrayList<>(strings.subList(0, 4));

            System.out.println("strings: " + strings);
            System.out.println("sublist: " + sublist);

            // thay đổi phần tử trong danh sách ban đầu sẽ phản ảnh trong danh sách phụ và ngược lại.
            strings.set(0, "Nhiệt huyết");
//            sublist.set(2, "Nhiệt huyết");

            // Hiển thị danh sách cha và con
//            System.out.println("Danh sách cha:");
//            for (int i = 0; i < strings.size(); i++) {
//                System.out.println(strings.get(i) + ", ");
//            }
            System.out.println("strings: " + strings);
//            System.out.println("Danh sách con:");
//            for (int i = 0; i < sublist.size(); i++) {
//                System.out.println(sublist.get(i) + ", ");
//            }
            System.out.println("sublist: " + sublist);

        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void queue() {

        // không giới hạn phần tử, kích thước tự mở rộng khi thêm mới
        Queue<String> strings = new LinkedList<>();

        strings.add("Đam mê");
        strings.add("Tộc độ");
        strings.add("Thành công");
        strings.offer("Quan tâm");
        strings.offer("Thẳng thắn");
        strings.add("Bình an");

        System.out.println("size: " + strings.size());

        // LinkedBlockingQueue có thể hoặc không giới hạn phần tử
        Queue<Integer> number = new ArrayBlockingQueue<>(5, true);
        number.add(1);
        number.add(2);
        number.add(3);

        System.out.println("number: " + number);

        // ArrayBlockingQueue(int capacity);
        // ArrayBlockingQueue(int capacity, boolean fair):
        // ArrayBlockingQueue(int capacity, boolean fair, Collection c):

    }
    public static void main(String[] args) {
//        arrayList();
        queue();
    }
}
