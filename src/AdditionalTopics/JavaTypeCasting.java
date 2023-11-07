package AdditionalTopics;
// Chủ đề bổ sung

public class JavaTypeCasting {
    public static void main(String[] args) {
        // chuyển kiểu mở rộng: không bị mất dữ liệu, java tự động chuyển
        int num = 10;
        System.out.println(num);
        double data = num;
        System.out.println(data);
        // chuyển kiểu thu hẹp:
        double num2 = 10.5;
        System.out.println(num2);
        int data2 = (int)num2;
        System.out.println(data2);
        // chuyển kiểu từ string sang int
        String num3 = "3";
        int data3 = Integer.parseInt(num3);
        System.out.println(data3);
        try {
            String num4 = "bốn";
            int data4 = Integer.parseInt(num4);
            System.out.println(data4);
        } catch (NumberFormatException e) {
            System.out.println("Ngoại lệ: " + e.getMessage());
        }
    }
}
