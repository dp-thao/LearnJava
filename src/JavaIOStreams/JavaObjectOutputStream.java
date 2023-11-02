package JavaIOStreams;

import java.io.*;


class Dog implements Serializable {
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}

public class JavaObjectOutputStream {
    public static void main(String[] args) {

        try {
//            Method1();

            // tạo đối tượng Dog
            Dog dog1 = new Dog("Tyson", "Labrador");

            FileOutputStream fileOut = new FileOutputStream("file.txt");

            // tạo 1 ObjectOutpúttream
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            // ghi các đối tượng vào output stream
            objOut.writeObject(dog1);

            // đọc đối tượng
            FileInputStream fileIn = new FileInputStream("file.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            // đọc đối tượng
            Dog newDog = (Dog) objIn.readObject();

            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);

            objOut.close();
            objIn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // phương thức này được sử dụng để lưu dữ liệu int và String
    public static void Method1() {
        int data1 = 5;
        String data2 = "This is programz";

        try {
            FileOutputStream file = new FileOutputStream("file.txt");

            // tạo đối tượng ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);

            // viết đối tượng
            output.writeInt(data1);
            output.writeObject(data2);

            // đọc dữ liệu
            FileInputStream fileStream = new FileInputStream("file.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            System.out.println("Integer data: " + objStream.readInt());
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
