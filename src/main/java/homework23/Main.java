package homework23;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence = sc.nextLine();
        lastWord.characters(sentence);

        System.out.print("Enter your palindrome: ");
        String palindrome = sc.nextLine();
        if (lastWord.palindrome(palindrome) == true) {
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not palindrome");
        }
    }
}
