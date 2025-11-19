package lesson32Exeption;

public class Main {
    static void main() {

        int a = 10;
        int b = 0;

        int result = 0;

        try {

            result = MyMath.divide(a, b);

        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());

            result = Integer.MAX_VALUE;
        } finally {
            System.out.println("ALWAYS");
        }

        System.out.println(result);
    }
}
