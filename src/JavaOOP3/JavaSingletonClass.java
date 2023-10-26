package JavaOOP3;

// Java Singleton Class Syntax
class SingletonExample {

    // private field that refers to the object
    private static SingletonExample singleObject;

    // Một hàm tạo private hạn chế việc tạo các đối tượng bên ngoài lớp.
    private SingletonExample() {
        // constructor of the SingletonExample class
    }

    // Phương thức này trả về tham chiếu đến đối tượng duy nhất của lớp. Vì phương thức tĩnh nên nó có thể được truy cập
    // bằng tên lớp.
    public static SingletonExample getInstance() {
        // write code that allows us to create only one object
        // access the object as per our need
        SingletonExample singletonExample = new SingletonExample();
        return singletonExample;
    }
}

// Use of Singleton in Java
class Database {
    // 1. private attribute
    // Điều này sẽ đề cập đến đối tượng của class Database.
    private static Database dbObject;
    // 2. private contructor
    // Ngăn chặn việc tạo đối tượng bên ngoài lớp
    private Database() {
    }
    // 3. public static method
    // trả thể hiện của lớp đó ra thế giới bên ngoài.
    public static Database getInstance() {

        // create object if it's not already created
        if(dbObject == null) {
            dbObject = new Database();
        }

        // returns the singleton object
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}
public class JavaSingletonClass {
    public static void main(String[] args) {
        Database db1;

        // refers to the only object of Database
        db1= Database.getInstance();

        db1.getConnection();
    }
}
