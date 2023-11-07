package JavaExceptionHanding;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.*;
import java.util.logging.StreamHandler;


// Có 2 trình xử lý ghi nhật kí mặc định được cung cấp bởi API là ConsoleHandler và FileHandler trong Java
// Có thể tự tạo thêm trình xử lý tùy chỉnh bằng cách mở rộng  lớp java.util.logging.Handler hoặc bất kỳ lớp con nào
// của nó như StreamHandler, SocketHandler,
class MyHandler extends StreamHandler{
    @Override
    public void publish(LogRecord record) {
        super.publish(record);
    }

    @Override
    public void flush() {
        super.flush();
    }


    @Override
    public void close() throws SecurityException {
        super.close();
    }
}


// Có 2 trình định dạng thông điệp tường trình có sẵn trong api ghi nhật kí Java: SimpleFormatter và XMLFormatter
// có thể tạo lớp Formatter tùy chỉnh của riêng mình bằng cách mở rộng java.util.logging.Formatterlớp và đính kèm nó vào
// bất kỳ trình xử lý nào
class MyFormatter extends Formatter{

    @Override
    public String format(LogRecord record) {
        return record.getThreadID()+"::"+record.getSourceClassName()+"::"
                +record.getSourceMethodName()+"::"
                +new Date(record.getMillis())+"::"
                +record.getMessage()+"\n";
    }
}

//class MyFilter implements Filter{
//
//    @Override
//    public boolean isLoggable(LogRecord record) {
//        //don't log CONFIG logs in file
//        if(log.getLevel() == Level.CONFIG) return false;
//        return true;
//    }
//}

// Quản lý học sinh có sử dụng thêm Logger

public class JavaLogging {

    // khai báo một biến logger tương ứng với tên của lớp JavaLogging
    // getLogger("") : định danh 1 logger cụ thể trong hệ thống ghi nhật kí.
    // Mỗi logger có một tên duy nhất, cho phép bạn xác định từng phần của ứng dụng và quản lý ghi nhật ký cho
    // từng phần đó một cách riêng lẻ.
    // Nếu logger (JavaLogging) này đã tồn tại, nó sẽ được trả về; nếu chưa tồn tại, một logger mới sẽ được tạo.
    private static final  Logger logger = Logger.getLogger(JavaLogging.class.getName());

    // thuộc tính của học sinh
    String name;
    int age;

    JavaLogging() {}
    JavaLogging(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // phương thức thêm học sinh mới có hiển thị thông tin học sinh đã thêm
    public void AddStudent() {
        ArrayList<JavaLogging> students = new ArrayList<>();
        // thêm 5 học sinh
        for (int i = 0; i <= 5; i++) {
            String nameStudent = "name " + (i+1);
            JavaLogging student = new JavaLogging(nameStudent, 22);
            students.add(student);
        }
        // đặt mức độ log (level) cho logger
//        logger.setLevel(Level.INFO);
        logger.info("Đã thêm học sinh thành công.");

        if (students.size() > 0) {
            System.out.println("Danh sách học sinh:");
            for (JavaLogging student : students) {
                System.out.println("Name: " + student.name + "\t\t" + "Age: " + student.age);
            }
        }
        logger.log(Level.INFO, "Đã hiển thị được danh sách học sinh.");
        // Sự khác biệt chính giữa hai phương thức này nằm ở cách bạn gọi chúng và đối số mức độ log.
        // logger.log cho phép bạn tự chọn mức độ log, trong khi logger.info là cách thuận tiện để ghi thông điệp ở mức
        // độ "INFO" mà không cần phải chỉ định mức độ log một cách rõ ràng.
    }

    public static void main(String[] args) {
        try {
            // là lớp đọc cấu hình ghi nhật ký, tạo và duy trì các phiên bản logger. Chúng ta có thể sử dụng lớp này để
            // thiết lập cấu hình cụ thể cho ứng dụng của riêng mình
            LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }

//        logger.setLevel(Level.FINE);
//        logger.addHandler(new ConsoleHandler());
//
//        // bổ xung tùy chọn xử lý
//        logger.addHandler(new MyHandler());

        try {
            // tên tệp FileHandler với max size và số lượng giới hạn tệp nhật kí
            // FileHandler: ghi tất cả các thông báo ghi nhật ký vào tệp ở định dạng XML
            Handler fileHandler = new FileHandler("mylogging.log", 2000, 1);
            fileHandler.setFormatter(new MyFormatter());
            //cài đặt tùy chỉnh bộ lọc cho FileHandler
//            fileHandler.setFilter(new MyFilter());
            logger.addHandler(fileHandler);
            for(int i=0; i<1000; i++){
                //logging messages
                logger.log(Level.INFO, "Msg"+i);
            }
            logger.log(Level.CONFIG, "Config data");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // gọi hàm thêm học sinh
        JavaLogging javaLogging = new JavaLogging();
        javaLogging.AddStudent();

        // ghi nhật kí vào tệp
//        try {
//            FileHandler file = new FileHandler("QLHocSinh.log");
//            file.setFormatter(new XMLFormatter());
//            logger.addHandler(file);
//        } catch(Exception e) {
//            e.printStackTrace();
//        }

    }
}
