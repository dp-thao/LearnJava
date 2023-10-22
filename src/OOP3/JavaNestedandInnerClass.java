package OOP3;

// Non-static nested class
class CPU {
    double price;

    // nested class
    class Processor {
        // members of nested class
        double cores;
        String manufacturer;

        double getCache() {
            return 4.3;
        }
    }

    // nested class
    protected class RAM {
        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}

// Truy cập thành viên của lớp ngoài bên từ lớp trong thông qua từ khóa this
class Car {
    String carName;
    String carType;

    // gán giá trị bằng cách sử dụng hàm tạo
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

    // inner class
    class Engine {
        String engineType;
        void setEngine() {
            // truy cập thuộc tính carType của Car
            // Car.this.carType.equals("4WD") : nếu không có Car của outer class thì this sẽ hiểu là thành viên của
            // inner class
            if (Car.this.carType.equals("4WD")) {
                // phương thức gọi getCarName() của Car
                if (Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }
            } else {
                this.engineType = "Bigger";
            }
        }

        String getEngineType() {
            return this.engineType;
        }
    }
}

public class JavaNestedandInnerClass {
    public static void main(String[] args) {
        // create object of Outer class CPU
        CPU cpu = new CPU();

        // create object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();

        // create object of inner class RAM using outer class CPU
        CPU.RAM ram = cpu.new RAM();

        System.out.println("Processor Cach = " + processor.getCache());
        System.out.println("RAM Cach = " + ram.getClockSpeed());

        // create an object of the outer class Car
        Car car1 = new Car("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD = " + engine.getEngineType());

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());

    }
}
