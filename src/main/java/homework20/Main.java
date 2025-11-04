package homework20;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();

        System.out.print("Enter the car fuel: ");
        car.setFuel(sc.nextFloat());
        if (car.isFuelNegative()) {
            return;
        }

        System.out.print("Enter how much fuel does a car consume per 100 kilometer: ");
        car.setConsumption(sc.nextFloat());
        if (car.isConsumptionNegative()) {
            return;
        }

        System.out.print("Enter the date of expire: (like: 2000 12 31) ");
        LocalDate dateOfExpire = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        car.setDateOutOfMaintenance(dateOfExpire);

        System.out.println();
        System.out.println("The car has been created");

        if (car.isDateOutOfMaintenance(dateOfExpire)) {
            car.getDistance();
        }
    }
}