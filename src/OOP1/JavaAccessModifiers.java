package OOP1;
class JavaAccessModifiers {
    // private variable
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}

class Main {
    public static void main(String[] main){

        JavaAccessModifiers javaAccessModifiers = new JavaAccessModifiers();

        //javaAccessModifiers.name = "Programiz"; // Lỗi truy cập nếu chưa khai báo phương thức getter và setter

        String name = "Thao";
        javaAccessModifiers.setName(name);

        System.out.println("Tên tôi là: " + javaAccessModifiers.getName());
    }
}
