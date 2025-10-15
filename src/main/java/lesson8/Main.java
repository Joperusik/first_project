package lesson8;

public class Main {
    static void main() {
        String badWord = " _|_";
        String massage = "Hello, mfcker" + badWord + " nga!";


        System.out.println(massage);
        System.out.printf("Hello, mfcker %s nga!", badWord);

        for (int i = 0; i < massage.length() - 2; i++) {
            char pos1 = massage.charAt(i);
            char pos2 = massage.charAt(i + 1);
            char pos3 = massage.charAt(i + 2);

            if (pos1 == badWord.charAt(0) && pos2 == badWord.charAt(1) && pos3 == badWord.charAt(2)) {
                massage = massage.replace(badWord, "###");
            };
        }
    }
}
