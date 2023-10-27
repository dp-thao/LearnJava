package JavaSet;

public class HashCodeExample {

    // hàm băm sử dụng hashCode()
    public static void main(String[] args) {
        String str1 = "Hello"; //69609650
        String str11 = "Hello";
        String str2 = "World";
        String str3 = "Welcome";

        // Sử dụng hàm băm hashCode() để lấy giá trị số học
        int hash1 = str1.hashCode();
        int hash11 = str11.hashCode();
        int hash2 = str2.hashCode();
        int hash3 = str3.hashCode();

        System.out.println("Hash code of 'Hello': " + hash1);
        System.out.println("Hash code of 'Hello': " + hash11);
        System.out.println("Hash code of 'World': " + hash2);
        System.out.println("Hash code of 'Welcome': " + hash3);
    }
}
