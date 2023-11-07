package StudentManagement;

import java.util.*;

public class Subject  implements Comparable<Subject>{
    private String nameSubject;

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public Subject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public Subject() {}

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
            scanner.nextLine();
            String nameSubject1 = scanner.nextLine();
            subject.nameSubject = nameSubject1;
//            subject.nameSubject = scanner.nextLine();
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

    public void DeleteSubject(TreeSet<Subject> subjects) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào tên môn học muốn xóa: ");
            String name = scanner.next();
            Iterator<Subject> iterator = subjects.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().nameSubject.toString().equals(name)) {
                    subjects.remove(new Subject(name));
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }



    @Override
    public int compareTo(Subject o) {
        return this.nameSubject.compareTo(o.nameSubject);
    }
}
