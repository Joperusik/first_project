package homework23;

public class lastWord {
    public static void characters(String args) {
        String text = args.trim();
        String result = text.replaceAll("\\s{2,}", " "); //заменяет 2 пробела на 1
        int length = result.length();
        int index = result.lastIndexOf(' ');
        int lengthResult = length - index;
        System.out.println("Last word length is: " + (lengthResult - 1));
    }

    public static boolean palindrome(String args) {
        String text = args.trim();
        String clean = text.replaceAll("[^\\p{L}]+", "");
        String reversed = new StringBuilder(clean).reverse().toString();
        if (clean.equals(reversed) == true) {
            return true;
        }
        return false;
    }
}
