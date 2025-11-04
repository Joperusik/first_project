package homework20;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private float fuel;
    private float consumption;
    private LocalDate dateOutOfMaintenance;

    public boolean isFuelNegative() {
        if (fuel <= 0) {
            System.out.println("Fuel cannot be negative");
            return true;
        }
        return false;
    }

    public boolean isConsumptionNegative() {
        if (consumption <= 0) {
            System.out.println("Consumption cannot be negative");
            return true;
        }
        return false;
    }

    public boolean isDateOutOfMaintenance(LocalDate dateOfExpire) {
        if (LocalDate.now().isBefore(dateOfExpire) || LocalDate.now().isEqual(dateOfExpire)) {
            System.out.println("The car is approved for driving");
            return true;
        } else {
            System.out.println("The car is not allowed to be used.");
            return false;
        }
    }

    public void getDistance() {
        float distance = (fuel / consumption) * 100;
        System.out.println("The car can drive approximately " + distance + " kilometers with the current fuel level.");
    }
}
