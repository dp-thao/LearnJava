package StudentManagement;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Animal implements Comparable<Animal> {

    private String name;

    public static TreeSet<Animal> animals = new TreeSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public TreeSet<Animal> AddAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong dong vat: ");
        int quantity = scanner.nextInt();

        int i = 0;
        while(i < quantity) {
            System.out.print("Nhap dong vat " +(i+1) + ": ");
            Animal animal = new Animal();
            animal.name = scanner.next();
            animals.add(animal);
            i++;
        }
        return animals;
    }

    public String DisplayAnimal(TreeSet<Animal> animals) {
        String result = "";

        Iterator<Animal> iterator = animals.iterator();
        while(iterator.hasNext()) {
            result += (iterator.next().name + ", ");
        }

        return result;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Them thong tin dong vat");
            System.out.println("2. Hien thong tin dong vat");
            System.out.println("3. Thoat");
            System.out.print("Nhap chuc nang: ");
            int input = scanner.nextInt();

            Animal animal = new Animal();

            switch (input) {
                case 1:
                    animal.AddAnimal();
                    break;
                case 2:
                    System.out.println("Danh sach dong vat: " + animal.DisplayAnimal(animals));
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Chuc nang khong hop le. Moi nhap lai.");
            }
        }
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }
}
