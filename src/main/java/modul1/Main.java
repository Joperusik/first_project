package modul1;

public class Main {
    static void main() {
//        int[] arr = {1, 2, 5, 3, 7, -1};
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        int[] arr1 = {1, 2, 3, 4, 5, 6};
//        int ellement = 4;
//        System.out.println(Practice.search(arr1, ellement));

//        while (true){
//            System.out.println("Я є цикл");
//        }

        int[][] arr2 = {
                {2, 4, -1},
                {-10, 5, 11},
                {18, -7, 6}
        };
        Practice.printMatrix(Practice.transpose(arr2));
    }
}
