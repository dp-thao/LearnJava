package JavaExceptionHanding;

import java.util.logging.*;

public class JavaLogging {
    public static void main(String[] args) {

        // Phương getLogger()thức của Loggerlớp được sử dụng để tìm hoặc tạo một tệp Logger. Đối số chuỗi xác định tên của logger.
        Logger logger = Logger.getLogger("newLoggerName");
        logger.setLevel(Level.INFO); // Đặt mức ghi log là INFO
        logger.info( "This is INFO log level message");
        logger.warning( "This is WARNING log level message");

//        try {
//            // Mã có thể ném ngoại lệ
//            ConsoleHandler consoleHandler = new ConsoleHandler();
//            SimpleFormatter simpleFormatter = new SimpleFormatter();
//            consoleHandler.setFormatter(simpleFormatter);
//            logger.addHandler(consoleHandler);
//        } catch (Exception e) {
//            logger.log(Level.SEVERE, "An error occurred", e);
//        }
    }
}
