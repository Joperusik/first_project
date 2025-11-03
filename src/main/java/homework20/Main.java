package homework20;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();

        System.out.print("Enter the car fuel: ");
        car.setFuel(sc.nextFloat());
        if (car.getFuel() < 0) {
            System.out.println("Car fuel is negative");
            return;
        }

        System.out.print("Enter how much fuel does a car consume per 100 kilometer: ");
        car.setConsumption(sc.nextFloat());
        if (car.getConsumption() < 0) {
            System.out.println("Car consumption is negative");
            return;
        }

        System.out.print("Enter the date of expire: (like: 2000 12 31) ");
        LocalDate dateOfExpire = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        car.setDateOutOfMaintenance(dateOfExpire);

        System.out.println();
        System.out.println("The car has been created");

        if (LocalDate.now().isBefore(dateOfExpire) || LocalDate.now().isEqual(dateOfExpire)) {
            System.out.println("The car is approved for driving");
            if (car.getFuel() > 0) {
                float distance = (car.getFuel() / car.getConsumption()) * 100;
                System.out.println("The car can drive approximately " + distance + " kilometers with the current fuel level.");
            } else {
                System.out.println("There is no fuel in the car");
            }
        } else {
            System.out.println("The car is not allowed to be used.");
        }
    }
}
