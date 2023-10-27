package JavaList;

public class MultithreadingExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Tạo và khởi tạo hai luồng
        Thread thread1 = new Thread(new SumTask(array1));
        Thread thread2 = new Thread(new SumTask(array2));

        // Khởi động các luồng
        thread1.start();
        thread2.start();

        try {
            // Chờ cho tất cả các luồng kết thúc
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Tổng của hai mảng
        int total = SumTask.getTotalSum();
        System.out.println("Tổng của hai mảng là: " + total);

    }
}

class SumTask implements Runnable {
    private int[] array;
    private static int totalSum = 0;

    public SumTask(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        addToTotalSum(sum);
    }

    // Đồng bộ hóa để thêm vào tổng
    private synchronized void addToTotalSum(int sum) {
        totalSum += sum;
    }

    public static int getTotalSum() {
        return totalSum;
    }
}




