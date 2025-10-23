package lesson13Scanner;

import java.util.Scanner;

public class Practice2 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

//        int [][] matrixManual = {
//                {1, 2 ,4},
//                {3, 5, 6}
//        };

        System.out.println("Matrix Data ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            // [0, 0] [0, 1] [0, 2]
            // [1, 0] [1, 1] [1, 2]
            // [2, 0] [2, 1] [2, 2]
        }
        System.out.println("Enter matrix ellement");
        //
        for (int i = 0; i < m; i++) {
            System.out.print("Enter  ↓ " + (i + 1) + " ");
            System.out.println("Enter → " + n + " ellements ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }

        }
        System.out.println("Now matrix is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("sum of matrix ellement: " + sum);
    }
}
