package Lessom16ClassAndObjects;


import Lessom16ClassAndObjects.animals.Cat;

public class Practice {
    static void main() {
        // без параметров
        Cat cat1 = new Cat();

        cat1.setName("Barsik");
        cat1.setAge(23);
        cat1.setWeight(3.5);

        System.out.println("Name: " + cat1.getName());
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Weight: " + cat1.getWeight());

        // с параметрами
        Cat cat2 = new Cat("cat", 15, 2.9);

        System.out.println("Name: " + cat2.getName());
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Weight: " + cat2.getWeight());

        //toString
        System.out.println(cat2.toString());
    }
}
