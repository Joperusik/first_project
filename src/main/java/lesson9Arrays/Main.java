package lesson9Arrays;

public class Main {
    static void main() {
        int [] array1 = {1,2,3,4,5}; //0,1,2,3,4 позиция
        String [] array2 = {"Java","is the best"}; //0,1 позиция
        System.out.println(array1.length);

        //array1[0] = array1[1];
        //System.out.println(array1[0]);

        int [] arr1 = new int [3];// 0,0,0
        arr1[0] = 2;
        arr1[1] = 4;
        arr1[2] = 5;
        System.out.printf("Длинна масива arr1: %s \n", arr1.length);

        System.out.printf("До 1: %s 2: %s 3: %s \n", arr1[0], arr1[1], arr1[2]);
        int a = arr1[0];
        int b = arr1[1];
        arr1[0] = b;
        arr1[1] = a;
        System.out.printf("После 1: %s 2: %s 3: %s \n", arr1[0], arr1[1], arr1[2]);
        //int leght = arr1.length;
        //System.out.println(leght);

    }
}
