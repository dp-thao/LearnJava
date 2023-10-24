package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static int inner;
    Student student = new Student();
    ArrayList<Student>  students;
    public static void main(String[] args) {
        try {
            Main main = new Main();
            main.menu();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void menu() {
        System.out.println("\n============= Quản lý sinh viên =============");
        System.out.println("  1. Nhập danh sách sinh viên.");
        System.out.println("  2. Hiện danh sách sinh viên.");
        System.out.println("  3. Xóa sinh viên.");
        System.out.println("  4. Cập nhật gpa sinh viên.");
        System.out.println("  5. Tìm kiếm sinh viên.");
        System.out.println("  0. Thoát chương trình.");
        System.out.println("=============================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào lựa chọn: ");
        inner = scanner.nextInt();
        System.out.println();

        switch ( inner) {
            case 1:
                students = student.AddStudent();
                menu();
                break;
            case 2:
                student.DisplayStudents(students);
                menu();
                break;
            case 3:
                student.DeleteStudent(students);
                menu();
                break;
            case 4:
                student.UpdateStudent(students);
                menu();
                break;
            case 5:
                student.SearchStudentByName(students);
                menu();
                break;
            case 0:
                exit(0);
            default:
                break;
        }
    }
}
