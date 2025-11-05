package lesson23StringBuilder;

public class Main {
    static void main() {

//        StringBuilder builder = new StringBuilder("Hello World");
//        builder.deleteCharAt(2);
//        String result = builder.toString();
//        System.out.println(result);
//        builder.reverse();
//        String resultR = builder.toString();
//        System.out.println(resultR);

//        String txt = "Hello World!";
//        String txt2 = "Hello World!";
//        System.out.println(txt.equals(txt2));

        boolean result = Practice.isPalindrome(121);
        System.out.println(result);

        int [] arr1 = {2,3,3};
        int result2 = Practice.majorityElement(arr1);
        System.out.println(result2);
    }
}
