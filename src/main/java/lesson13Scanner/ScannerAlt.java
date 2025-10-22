package lesson13Scanner;

import java.util.Scanner;

public class ScannerAlt {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your num: ");
        String str = scanner.nextLine();
        // какой имеено тип данных парсить
        int a = Integer.parseInt(str);

        System.out.println(a * 10_000);
    }
}
