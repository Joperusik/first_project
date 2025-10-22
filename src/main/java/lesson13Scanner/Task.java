package lesson13Scanner;

import java.util.Scanner;

public class Task {
    static void main() {

        Scanner scanner = new Scanner(System.in); // сканнер

        System.out.print("Enter the number of elements in the array: ");
        int arrLength = scanner.nextInt(); // масив будет равен числу который мы ввели
        int[] arr = new int[arrLength];
        // записываем каждый эллемент
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter element " + i + ": "); // (i + 1) для того что бы
            arr[i] = scanner.nextInt();
        }

        // вывести все эллементы
        for  (int i = 0; i < arrLength; i++) {
            System.out.println("Arr[" + i + "]: " + arr[i] + " ");
        }
        scanner.close();

        //сумма всех эллементов
        int sum = 0;
        for (int i = 0; i < arrLength; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array: " + sum);

        // min ellement
        int minEllement = arr[0];
        for (int i = 1; i < arrLength; i++) {
            if (arr[i] < minEllement) {
                minEllement = arr[i];
            }
        }
        System.out.println("Minimum element is " + minEllement);

    }
}
