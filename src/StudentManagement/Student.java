package StudentManagement;

import java.util.*;

public class Student extends People {
    /* điểm trung bình của sinh viên */
    private float gpa;
    // Lớp môn học tự định nghĩa
    private TreeSet<Subject> subjects;
    ArrayList<Student> students = new ArrayList<>();
    Student() {}

    Student(int id, String name, int age, float gpa) {
        super(id, name, age);
        this.gpa = gpa;
    }

    // Thêm sinh viên
    public ArrayList<Student> AddStudent() {
        try {
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
                System.out.print("Có nhập thông tin môn học không (1.Có - 0.Không)?: ");
                int result = scanner.nextInt();
                if (result == 1) {
                    Subject subject = new Subject();
                    student.subjects = subject.AddSubject();
                } else {
                    student.subjects = new TreeSet<>();
                }
                // Thêm sinh viên vào danh sách
                students.add(student);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;
    }

    // Hiện sinh viên
    public static void DisplayStudent(Student student) {
        try {
            if (student.subjects.size() > 0) {
                Subject subject = new Subject();
                System.out.println("Mã SV: " + student.getId() + "\t\tTên SV: " +  student.getName()+ "\t\tTuổi: " +
                        student.getAge() + "\t\tGPA: " + student.gpa + "\t\tMôn học: " + subject.DisplaySubject(student.subjects));
            } else {
                System.out.println("Mã SV: " + student.getId() + "\t\tTên SV: " +  student.getName()+ "\t\tTuổi: " +
                        student.getAge() + "\t\tGPA: " + student.gpa);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Hiện danh sách sinh viên
    public static void DisplayStudents(ArrayList<Student> students) {
        try {
            // System.out.println("Mã SV \t\t Họ và tên \t\t Tuổi \t\t GPA");
            for (Student student : students) {
                if (student.subjects.size() > 0) {
                    Subject subject = new Subject();
                    System.out.println("Mã SV: " + student.getId() + "\t\tTên SV: " +  student.getName()+ "\t\tTuổi: " +
                            student.getAge() + "\t\tGPA: " + student.gpa + "\t\tMôn học: " + subject.DisplaySubject(student.subjects));
                } else {
                    System.out.println("Mã SV: " + student.getId() + "\t\tTên SV: " +  student.getName()+ "\t\tTuổi: " +
                            student.getAge() + "\t\tGPA: " + student.gpa);
                }
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

    // Cập nhật môn học sinh viên theo tên sinh viên
    public void UpdateSubjectStudent(ArrayList<Student> students) {
         try {
             Scanner scanner = new Scanner(System.in);
             System.out.print("\nNhập tên sinh viên muốn cập nhân môn học: ");
             String nameStudent = scanner.nextLine();
             ArrayList<Student> newListStudent = SearchByName(students, nameStudent);
             // tìm kiếm sinh viên để cập nhật thông tin môn học
             if (newListStudent.size() > 1) {
                 // Hiện thông tin sinh viên cần cập nhật
                 System.out.println("Thông tin sinh viên cần cập nhật: ");
                 for (int i = 0; i < newListStudent.size(); i++) {
                     DisplayStudent(newListStudent.get(i));
                 }
                 for (int i = 0; i < newListStudent.size(); i++) {
                     System.out.println("Cập nhật sinh viên " + (i+1) + ": ");
                     DisplayStudent(newListStudent.get(i));
                     // Hiện menu
                     subjectMenu(newListStudent, i);
                     // thông tin sinh viên sau khi cập nhật
                     System.out.println("Thông tin sau khi cập nhât: ");
                     DisplayStudent(newListStudent.get(i));
                     // hiện lại menu cập nhật môn học cho sinh viên
                     subjectMenu(newListStudent, i);
                 }
             } else if (newListStudent.size() == 1) {

             }else {
                 System.out.println("Không tìm thấy thông tin sinh viên!");
             }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
    }

    // menu cập nhật môn học
    public void subjectMenu(ArrayList<Student> students, int index) {
        Subject subject = new Subject();
        System.out.println("1. Thêm môn học");
        System.out.println("2. Sửa môn học");
        System.out.println("3. Xóa môn học");
        System.out.println("0. Trở về");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập lựa chọn: ");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    TreeSet<Subject> addSubject = subject.AddSubject();
                    students.get(index).subjects.addAll(addSubject);
                    break;
                case 3:
                    // hàm trả về danh sách môn học sau khi xóa
                    subject.DeleteSubject(students.get(index).subjects);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // cập nhật tuổi sinh viên
    public void UpdateAgeStudent(ArrayList<Student> students) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên sinh viên muốn cập nhật tuổi: ");
            String infoStudent = scanner.next();
            int count = 0;
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getName().contains(infoStudent)) {
                    System.out.print("Nhập tuổi muốn thay đổi: ");
                    int ageNew = scanner.nextInt();
                    students.get(i).setAge(ageNew);
                    System.out.println("Thông tin sinh viên sau khi cập nhật thông tin: ");
                    DisplayStudent(students.get(i));
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Không tìm thấy sinh viên.");
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
            System.out.println("Thông tin sinh viên cần tìm:");
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getName().contains(nameStudent)) {
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

    public ArrayList<Student> SearchByName(ArrayList<Student> students, String nameStudent) {
        ArrayList<Student> studentSearch = new ArrayList<>();
        try {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getName().contains(nameStudent)) {
                    studentSearch.add(students.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return studentSearch;
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
