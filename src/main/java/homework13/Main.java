package homework13;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        //Зчитати з клавіатури розмір масиву n. (n x m - для сміливих)
        System.out.print("Enter the number of elements in the array: ");
        int arrLength = scanner.nextInt(); // масив будет равен числу который мы ввели
        if (arrLength <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }
        int[] arr = new int[arrLength];
        //Створити масив цілих чисел і заповнити його даними користувача.
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        boolean end = true;
        while (end) {
            //Вивести текстове меню
            System.out.println("1 - Порахувати суму елементів");
            System.out.println("2 - Знайти середнє арифметичне всіх елементів");
            System.out.println("3 - Знайти найбільший елемент");
            System.out.println("4 - Завершити програму");
            System.out.print("Choose your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {

                //1 - Порахувати суму елементів
                case 1:
                    int sum = 0;
                    for (int i = 0; i < arrLength; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum of array: " + sum);
                    break;

                //2 - Знайти середнє арифметичне всіх елементів
                case 2:
                    int sumFor = 0;
                    for (int i = 0; i < arrLength; i++) {
                        sumFor += arr[i];
                    }
                    int result = sumFor / arrLength;
                    System.out.println("Average: " + result);
                    break;

                //3 - Знайти найбільший елемент
                case 3:
                    int maxEllement = arr[0];
                    for (int i = 1; i < arrLength; i++) {
                        if (arr[i] > maxEllement) {
                            maxEllement = arr[i];
                        }
                    }
                    System.out.println("Max of array: " + maxEllement);
                    break;
                //4 - Завершити програму
                case 4:
                    end = false;
                    break;
            }
            //Залежно від вибору (цифри 1, 2, 3 чи 4), виконувати відповідну дію.
            //Організувати цикл так, щоб меню повторно відображалося доти, доки
            //користувач не обере пункт «Завершити програму» (4).
        }
    }
}
