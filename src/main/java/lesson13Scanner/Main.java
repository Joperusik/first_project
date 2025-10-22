package lesson13Scanner;

import java.util.Scanner;

public class Main {
    static void main() {
        // сканнер
        Scanner scanner = new Scanner(System.in);
        // вывести надпись про ввод
        System.out.print("enter a number: ");
        // сканируется значение
        int unputValue = scanner.nextInt();
        // вывод
        System.out.println("You entered: " + unputValue);


        System.out.print("enter your word: ");
        String word = scanner.next();// слово
        System.out.println("You entered: " + word);

        System.out.print("enter your sentence: ");

        // пофиксить переход
        // костыль , чистим "\n"
        scanner.nextLine(); // этого для обычных задач хватает

        String sentence = scanner.nextLine(); // предложение
        System.out.println("You entered: " + sentence);
        scanner.close();

    }
}
