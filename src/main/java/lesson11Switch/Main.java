package lesson11Switch;

public class Main {
    static void main() {

        char grade = Character.toUpperCase('c');
        //Character.toUpperCase('c') Всегда верхний регистр

        switch (grade) {
            case 'A':
                System.out.println("The Best");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fine");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            case 'E':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }

        int weekDays = 5;
        switch (weekDays) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There are only seven days in a week. Bruh");
        }
    }
}
