package JavaExceptionHanding;

public class Java_catchMultipleExceptions {
    // Bắt nhiều ngoại lệ trong catch
    public static void main(String[] args) {
        try {
            int[] array = new int[10];
            array[10] = 30/0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // bắt ngoại lệ cơ sở, các ngoại lệ đều là lớp con của Exception,
        // nên thay vì bắt nhiều ngoại lệ thì ta bắt ngoại lệ Exception
        try {
            int[] array2 = new int[10];
            array2[10] = 30/0;
        } catch (Exception e) {
            System.out.println("Excetion: " + e.getMessage());
        }

        // lỗi biên dịch khi sử dụng Exception cha và các ngoại lệ con cùng một khối catch
//        try {
//            int array[] = new int[10];
//            array[10] = 30 / 0;
//        } catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
