package OOP3;

class People {
    String name;
    int age;

    People() {}
    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    class Carrer {
        String careerType;

        void setCareerType() {
            if (People.this.age > 18) {
                this.careerType = "giáo viên";
            } else {
                this.careerType = "học sinh";
            }
        }

        String getCareerType() {
            return this.careerType;
        }
    }

}


public class NestedandInnerClass {
    public static void main(String[] args) {
        // Khởi tạo outer object
        People people1 = new People("Thảo", 17);
        // Khởi tạo inner object
        People.Carrer carrer = people1.new Carrer();
        carrer.setCareerType();
        System.out.println(people1.getName() + " " + carrer.getCareerType());

        People people2 = new People("Phương", 22);
        People.Carrer carrer2 = people2.new Carrer();
        carrer2.setCareerType();
        System.out.println(people2.getName() + " " + carrer2.getCareerType());

    }
}
