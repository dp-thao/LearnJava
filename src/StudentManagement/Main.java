package StudentManagement;

import java.lang.reflect.Type;
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
        System.out.println("  4. Cập nhật thông tin sinh viên.");
        System.out.println("  5. Tìm kiếm sinh viên.");
        System.out.println("  6. Sắp xếp sinh viên.");
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
                UpdateMenu();
                menu();
                break;
            case 5:
                student.SearchStudentByName(students);
                menu();
                break;
            case 6:
                //student.SortStudentByAge(students);
                //
                SortMenu();
                menu();
                break;
            case 0:
                exit(0);
            default:
                break;
        }
    }

    public void UpdateMenu() {
        System.out.println("1. Cập nhật tuổi sinh viên");
        System.out.println("2. Cập nhật GPA");
        System.out.println("3. Cập nhật môn học");
        System.out.println("0. Thoát chức năng cập nhật");
        System.out.print("Lựa chọn cập nhật theo: ");
        Scanner scanner = new Scanner(System.in);
        int inner = scanner.nextInt();
        switch (inner) {
            case 1:
                break;
            case 2:
                student.UpdateStudent(students);
                break;
            case 3:
                student.UpdateSubjectStudent(students);
                break;
            case 0:
                exit(0);
            default:
                UpdateMenu();
                break;
        }
    }

    public void SortMenu() {
        System.out.println("\n1. Sắp xếp theo GPA giảm dần");
        System.out.println("2. Sắp xếp theo tuổi tăng dần");
        System.out.println("0. Thoát chức năng sắp xếp");
        System.out.print("Lựa chọn sắp xếp theo: ");
        Scanner scanner = new Scanner(System.in);
        int inner = scanner.nextInt();
        switch (inner) {
            case 1:
                student.SortStudentByGPA(students);
                SortMenu();
                break;
            case 2:
                student.SortStudentByAge(students);
                SortMenu();
                break;
            case 0:
                menu();
                break;
            default:
                SortMenu();
        }
    }
}
