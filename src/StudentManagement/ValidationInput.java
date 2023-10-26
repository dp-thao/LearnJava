package StudentManagement;

import java.util.Scanner;

public class ValidationInput {
    public static boolean isNumber(String num) {
        if (num == "") {
            return false;
        }
        try {
            Integer.parseInt(num);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean isString(int num) {
        try {
            String.valueOf(num);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập: ");
        int n = scanner.nextInt();
        if (isString(n)) {
            System.out.println("Đây là số");
        } else {
            System.out.println("Đây là chuỗi");
        }
    }
}
