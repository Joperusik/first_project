package lesson15MathObject;

public class MyMath {

    //min max
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double abs(double a) {
        if (a < 0) {
            a = a * -a;
            return a;
        } else {
            return a;
        }
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    public static int round (double a) {
        //4.3 -> 4
        //4.7 -> 4
        int result = (int) a;
        return result;
    }

    public static int getFactorial (int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
