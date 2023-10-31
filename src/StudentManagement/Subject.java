package StudentManagement;

import java.util.*;

public class Subject  implements Comparable<Subject>{
    private String nameSubject;

    public static TreeSet<Subject> subjects;

    public TreeSet<Subject> AddSubject() {
        subjects = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng môn học: ");
        int quantity = scanner.nextInt();

        int i = 0;
        while (i < quantity) {
            Subject subject = new Subject();
            System.out.print("Nhập môn học " + (i+1) + ": ");

            String nameSubject1 = scanner.next();
            subject.nameSubject = nameSubject1;
//            subject.nameSubject = scanner.next();
            subjects.add(subject);

            i++;
        }
        return subjects;
    }

    public String DisplaySubject(TreeSet<Subject> subjects) {
        String subject = "";
        Iterator<Subject> iterator = subjects.iterator();
        while (iterator.hasNext()) {
            subject = subject + iterator.next().nameSubject + ", ";
        }
        return subject;
    }

    public TreeSet<Subject> DeleteSubject(TreeSet<Subject> subjects) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên môn học muốn xóa: ");
        String nameSubject = scanner.next();
        boolean result = subjects.contains(nameSubject);
        if (result) {
            subjects.remove(nameSubject);
        } else {
            System.out.println("Không có môn học cần xóa.");
        }
        return subjects;
    }

    @Override
    public int compareTo(Subject o) {
        return this.nameSubject.compareTo(o.nameSubject);
    }
}
