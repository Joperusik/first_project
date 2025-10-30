package lesson15MathObject;

public class Main {
    static void main() {

        //стандартный клас Math
        int max = Math.max(5, 10);
        System.out.println("Max int: " + max);

        int min = Math.min(5, 10);
        System.out.println("Min int: " + min);

        double ceiling = Math.ceil(1.5); //большую часть
        System.out.println("CEILING: " + ceiling);

        double floored = Math.floor(1.5); //меньшую часть
        System.out.println("FLOOR: " + floored);

        double rounded = Math.round(1.5); //универсальный
        System.out.println("ROUNDED: " + rounded);

        //наш способ
        System.out.println("My method");

        int min1 = MyMath.min(5, 10); //MyMath это клас
        System.out.println("min1: " + min1);

        int pow = MyMath.power(5, 3);
        System.out.println("pow: " + pow);

        double round1 = MyMath.round(4.5);
        System.out.println("round1: " + round1);

        int n = 4;
        MyMath.getFactorial(n);
    }
}
