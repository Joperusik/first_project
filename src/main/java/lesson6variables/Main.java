package lesson6variables;

public class Main {

    static int b = 6; //доступно в любом классе (статичный, то есть не меняется)

    static void main() {

        int a = 5; // только в этом классе
        int b = 8;
        int c = a - b;

        char d = 'a';

        boolean e = true;

        System.out.println(c);
    }

}