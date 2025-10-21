package lesson12Loops;

public class Main {
    static void main() {


        int a = 1;
        while(a<=5) { // выполняется если улсовие верно
            System.out.print("a = " + a + ", ");
            a++;
            //для красоты, а точнее переход на новый ряд
            if (a>5) {
                System.out.println();
            }
        }

        int b = 7;
        do { //все равно выполняетс 1 раз
            System.out.println("b = " + b);
            b++;
        } while(b<=6);

        for (int i = 15; i <=20 ; i++) {
            System.out.print("i = " + i + ", ");
            //для красоты, а точнее переход на новый ряд
            if (i>=20) {
                System.out.println();
            }
        }

        /// практика
        int [] nums = {1,-2,-3,4,5,6};

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Arr" + nums[i] + "= " + nums[i] + "; ");
        }
        System.out.println();

        /// тольо для НЕ отрицательных
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();

        ///все отрицательные в НЕ отрицательные, а так же удваивает его
        for (int element : nums) { // для каждого, а так же масив не меняется
            if (element < 0) {
                element = element * -2;
            }
            System.out.print(element + " ");
        }
        System.out.println();

        /// простой перебор
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = nums[i] * -2;
            }
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
}
