package Lessom16ClassAndObjects;

import Lessom16ClassAndObjects.animals.Dog;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Dog dog = new Dog();

        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        String name1 = dog.setName(name);
        System.out.println("Name: " + name1);
    }
}
