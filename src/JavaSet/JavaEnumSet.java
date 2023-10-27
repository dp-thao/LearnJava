package JavaSet;

import java.util.EnumSet;

public class JavaEnumSet {

    // an enum named Size
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {
        // Creating an EnumSet using allOf()
        // allOf(): tạo một bộ enum chứa tất cả các giá trị của loại enum đã chỉ định
        EnumSet<Size> size1 = EnumSet.allOf(Size.class);
        System.out.println("EnumSet1: " + size1);

        // Creating an EnumSet using noneOf()
        // noneOf(): tạo ra một tập enum trống
        // Chú ý: We can only insert elements of enum type Size in the above program.
        // It's because we created our empty enum set using Size enum.
        EnumSet<Size> size2 = EnumSet.noneOf(Size.class);
        System.out.println("EnumSet2: " + size2);

        //  range(e1, e2): tạo ra một tập enum chứa tất cả các giá trị của một enum nằm giữa e1 Và e2 bao gồm cả hai giá trị
        // Creating an EnumSet using range()
        EnumSet<Size> size3 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        System.out.println("EnumSet3: " + size3);

        // of(): tạo một tập hợp enum chứa các phần tử được chỉ định
        // Using of() with a single parameter
        EnumSet<Size> size4 = EnumSet.of(Size.MEDIUM, Size.LARGE);
        System.out.println("EnumSet4: " + size4);

        //
        addMethod();

    }

    public static void addMethod() {
        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes1 = EnumSet.allOf(Size.class);

        // Creating an EnumSet using noneOf()
        EnumSet<Size> sizes2 = EnumSet.noneOf(Size.class);

        // Using add method
        sizes2.add(Size.MEDIUM);
        System.out.println("EnumSet Using add(): " + sizes2);

        // Using addAll() method
        sizes2.addAll(sizes1);
        System.out.println("EnumSet Using addAll(): " + sizes2);
    }
}
