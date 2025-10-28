package homeworkDragons;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //можливо можна створититрьох драконів через цикл і введення з клавіатури?
        System.out.print("How many Dragons do you want? ");
        int dragonCount = sc.nextInt(); //количество
        sc.nextLine();
        for (int i = 0; i < dragonCount; i++) {
            Dragon dragon = new Dragon();

            System.out.print("Enter Dragon's name: ");
            dragon.setName(sc.nextLine());

            System.out.print("Enter Dragon's age: ");
            dragon.setAge(sc.nextInt());
            sc.nextLine();


            System.out.print("Enter Dragon's weight: ");
            dragon.setWeight(sc.nextDouble());
            sc.nextLine();

            System.out.println();
            System.out.println(dragon);
            dragon.voice();
            dragon.fire();
            System.out.println();
        }
    }
}
