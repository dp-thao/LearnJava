package StudentManagement;

import java.util.*;

public class Student extends People {
    /* điểm trung bình của sinh viên */
    private float gpa;
    // Lớp môn học tự định nghĩa
    private Subject subject;
    ArrayList<Student> students = new ArrayList<>();
    Student() {}

    // Thêm sinh viên
    public ArrayList<Student> AddStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int quantity = scanner.nextInt();
        for (int i = 0; i < quantity; i++) {
            Student student = new Student();
            System.out.println("\nNhập thông tin sinh viên thứ: " + (i+1));
            System.out.print("Nhập mã sinh viên: ");
            student.setId(scanner.nextInt());
            System.out.print("Nhập họ tên sinh viên: ");
            scanner.nextLine(); // nhận Enter sau khi nhấn mã sinh viên
            student.setName(scanner.nextLine());
            System.out.print("Nhập tuổi sinh viên: ");
            student.setAge(scanner.nextInt());
            System.out.print("Nhập GPA sinh viên: ");
            student.gpa = scanner.nextFloat();
            // Môn học1
            student.subject = new Subject();
            System.out.print("Nhập môn học 1: ");
            scanner.nextLine();
            student.subject.setSubject1(scanner.nextLine());
            System.out.print("Nhập môn học 2: ");
            student.subject.setSubject2(scanner.nextLine());
            // Thêm sinh viên vào danh sách
            students.add(student);
        }
        return students;
    }

    // Hiện sinh viên
    public static void DisplayStudent(Student student) {
        try {
            // System.out.println("Mã sinh viên \t\t Họ và tên \t\t Tuổi \t\t GPA");
            System.out.println("Mã SV: " + student.getId() + "\t\tTên SV: " +  student.getName()+ "\t\tTuổi: " +
                    student.getAge() + "\t\tGPA: " + student.gpa + "\t\tMôn học 1: " + student.subject.getSubject1() + "\t\tMôn học 2: " + student.subject.getSubject2());
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Hiện danh sách sinh viên
    public static void DisplayStudents(ArrayList<Student> students) {
        try {
            // System.out.println("Mã SV \t\t Họ và tên \t\t Tuổi \t\t GPA");
            for (Student student : students) {
                System.out.println("Mã SV: " + student.getId() + "\t\tTên SV: " +  student.getName()+ "\t\tTuổi: " +
                        student.getAge() + "\t\tGPA: " + student.gpa + "\t\tMôn học 1: " + student.subject.getSubject1() + "\t\tMôn học 2: " + student.subject.getSubject2());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    // Xóa 1 sinh viên theo mã
    public void DeleteStudent(ArrayList<Student> students) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào mã sinh viên muốn xóa: ");
            int idStudent = scanner.nextInt();
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId() == idStudent) {
                    students.remove(i);
                } else {
                    System.out.println("Không tìm thấy sinh viên muốn xóa!");
                }
            }
            if (students.isEmpty()) {
                System.out.println("Danh sách sinh viên sau khi xóa là trống!");
            } else {
                System.out.println("Danh sách sinh viên sau khi xóa là:");
                DisplayStudents(students);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Cập nhật gpa của sinh viên
    public void UpdateStudent(ArrayList<Student> students) {
        try {
            int count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào mã sinh viên muốn cập nhật thông tin: ");
            int idStudent = scanner.nextInt();
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId() == idStudent) {
                    System.out.print("Nhập gpa muốn thay đổi: ");
                    float gpaNew = scanner.nextInt();
                    students.get(i).gpa = gpaNew;
                    System.out.println("Thông tin sinh viên sau khi cập nhật thông tin: ");
                    DisplayStudent(students.get(i));
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Không tìm thấy thông tin sinh viên!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Tìm kiếm sinh viên theo tên
    public void SearchStudentByName(ArrayList<Student> students) {
        try {
            int count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên sinh viên muốn tìm kiếm: ");
            String nameStudent = scanner.nextLine();
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getName().contains(nameStudent)) {
                    System.out.println("Thông tin sinh viên cần tìm:");
                    DisplayStudent(students.get(i));
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Không tìm thấy thông tin sinh viên!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Sắp xếp giảm dần danh sách sinh viên theo GPA
    public void SortStudentByGPA(ArrayList<Student> students) {
        try {
            for (int i = 0; i < students.size() - 1; i++) {
                for (int j = i+1; j < students.size(); j++) {
                    if (students.get(i).gpa < students.get(j).gpa) {
                        Student student = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, student);
                    }
                }
            }
//        Collections.sort(students, Collections.reverseOrder());
//        System.out.println("Danh sách sau khi sắp xếp: " + students);
            System.out.println("Danh sách sau khi sắp xếp: ");
            DisplayStudents(students);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void SortStudentByAge(ArrayList<Student> students) {
        try {
            for (int i = 0; i < students.size() - 1; i++) {
                for (int j = i+1; j < students.size(); j++) {
                    if (students.get(i).getAge() > students.get(j).getAge()) {
                        Student student = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, student);
                    }
                }
            }
//        Collections.sort(students, Collections.reverseOrder());
//        System.out.println("Danh sách sau khi sắp xếp: " + students);
            System.out.println("\nDanh sách sau khi sắp xếp: ");
            DisplayStudents(students);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
