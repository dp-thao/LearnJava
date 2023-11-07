package JavaExceptionHanding;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.logging.*;

// Lớp học sinh có sử dụng logger
class StudentLogging {
    // 1. Tao logger
    // private: phạm vi chỉ trong studentlogging
    // static: là thuộc tính của lớp, không cần phải tạo đối tượng và không cần phải thông qua đối tượng để sử dụng
    // final: định danh với tên duy nhất (ở đây là StudentLogging)
    // đảm bảo tính bảo mật và tính nhất quán
    private static final Logger logger = Logger.getLogger(StudentLogging.class.getName());

    // Thông tin học sinh
    String name;
    int age;

    StudentLogging() {}

    StudentLogging(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Tao danh sach hoc sinh
    public static void StudentList() {
        ArrayList<StudentLogging> students = new ArrayList<>();
        // tao 5 hoc sinh
        int i = 0;
        while (i <= 5) {
            // tao doi tuong hoc sinh
            String nameStudent = "name " + i;
            StudentLogging student = new StudentLogging(nameStudent, 22);
            students.add(student);
            i++;
        }

        // đặt mực độ log là INFO thì chỉ có các mức độ cao hơn được ghi lại, mức thấp hơn sẽ không được ghi lại
//        logger.setLevel(Level.INFO);
        logger.warning("Đã thêm 5 học sinh");
//        logger.fine("Log fine level");
//        logger.warning("Log warning level");

        // hien 5 hoc sinh
        for(StudentLogging student : students) {
            System.out.println("Name: " + student.name + "\t\t" + "Age: " + student.age);
        }

        logger.log(Level.INFO, "Hiển thị danh sách học sinh");
    }
    public static void main(String[] args) {

        // 2. Sử dụng trình xử lí ghi nhật kí ConsoleHandler
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINE);
        consoleHandler.setFormatter(new SimpleFormatter());  // XMLFormatter()
        logger.addHandler(consoleHandler);

        // 2. Sử dụng trình xử lý ghi nhật kí FileHandler
//        try {
//            Handler fileHandler = new FileHandler("FileHandler.Log");
//            fileHandler.setLevel(Level.INFO);
//            fileHandler.setFormatter(new XMLFormatter()); //SimpleFormatter()
//            logger.addHandler(fileHandler);
//        } catch (Exception e) {
//            logger.severe("Lỗi xảy ra trong khi thiết lập file logger: " + e);
//        }

        // (*). Sử dụng file cấu hình (chúng ta tự tạo file cấu hình)
//        try {
//            LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
//        } catch (Exception e) {
//            e.getMessage();
//        }

        // 2. Sử dụng database


        // phải đặt hàm ghi log dưới hoạt động trình xử lí ghi nhật kí log
        StudentList();
    }
}
