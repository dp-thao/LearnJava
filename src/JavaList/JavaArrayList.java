package JavaList;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args){
//        generalMethod();
        arrayList();

    }

    public static void generalMethod() {
        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList: " + languages);

        // get the element from the arraylist
        String lang = languages.get(1);
        System.out.print("Element at index 1: " + lang);

        // change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);

        // remove element from index 2
        String str = languages.remove(2);
        System.out.println("Updated ArrayList: " + languages);
        System.out.println("Removed Element: " + str);

        // iterate using for-each loop
        System.out.println("Accessing individual elements:  ");
        for(String item : languages) {
            System.out.print(item);
            System.out.print(", ");
        }
    }

    public static void arrayList() {

        // danh sách cha
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Đam mê");
        strings.add("Tộc độ");
        strings.add("Thành công");
        strings.add("Uy tín");
        strings.add("Cầu tiến");

        // thay đổi phi cấu trúc: hành động sửa đổi hoặc thay thế một phần tử
        // thay đổi cơ cấu: hành động thêm phần tử mới hoặc xóa phần tử

        try
        {
            // subList() có thể ném ra ngoại lệ nếu 1 trong 2 giá trị nằm ngoài phạm vi,
            // chỉ số bắt đầu được chỉ định nhỏ hơn 0 hoặc chỉ số kết thúc lớn hơn kích thước ArrayList.
            // subList() trả về đối tượng của List thay vì của ArrayList, nếu cố gằng ép kiểu ArrayList thì sẽ xảy ra
            // ngoại lệ
            // sử dụng cách này là tạo liên kết trực tiếp, nếu thay đổi danh sách con hoặc cha thì sẽ thay đổi danh sách
            // còn lại.
            List<String> sublist = strings.subList(0, 4);
            // Có thể sử dụng hàm tạo của ArrayList, sử dụng cách này (new ArrayList<>(strings.subList(0, 4))) là đã tạo
            // bản sao, bản sao này không liên kết với danh sách gốc ban đầu, thay đổi trong danh sách gốc không ảnh
            // hưởng đến danh sách con.
            // tạo danh sách con
//            ArrayList<String> sublist = new ArrayList<>(strings.subList(0, 4));

            System.out.println("strings: " + strings);
            System.out.println("sublist: " + sublist);

            // thay đổi phần tử trong danh sách ban đầu sẽ phản ảnh trong danh sách phụ và ngược lại.
            // thay đổi phi cấu trúc: hành động sửa đổi hoặc thay thế một phần tử
            strings.set(0, "Nhiệt huyết");
//            sublist.set(2, "Nhiệt huyết");
            // thay đổi cơ cấu: hành động thêm phần tử mới hoặc xóa phần tử
            // Bất kỳ thay đổi cấu trúc nào được thực hiện trực tiếp đối với danh sách ban đầu sẽ làm mất hiệu lực danh sách phụ
            // Nếu có bất kỳ nỗ lực nào được thực hiện để truy cập vào danh sách phụ sau đó, nó sẽ ném
            // ra ConcurrentModificationException.
            strings.add("Phát triển");
//            sublist.add("Phát triển");

            // Hiển thị danh sách cha và con
            System.out.println("strings: " + strings);
            System.out.println("sublist: " + sublist);

        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
