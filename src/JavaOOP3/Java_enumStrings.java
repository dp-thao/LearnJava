package JavaOOP3;

// enum Strings
enum SizeEnum {
    SMALL, MEDIUM, LARGE, EXTRALARGE;
}

// Change Default String Value of enums
enum SizeEnum2 {
    SMALL {

        // overriding toString() for SMALL
        public String toString() {
            return "The size is small.";
        }
    },

    MEDIUM {

        // overriding toString() for MEDIUM
        public String toString() {
            return "The size is medium.";
        }
    };
}

public class Java_enumStrings {
    public static void main(String[] args) {
        System.out.println("string value of SMALL is " + SizeEnum.SMALL.toString());
        System.out.println("string value of MEDIUM is " + SizeEnum.MEDIUM.name());

        System.out.println(Size.MEDIUM.toString());
    }
}
