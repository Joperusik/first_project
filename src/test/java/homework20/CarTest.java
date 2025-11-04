package homework20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void shouldBeNegativeFuel() {
        //give
        Car car = new Car();
        //when
        boolean result = car.isFuelNegative();
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void schouldBeNegativeConsumption() {
        //give
        Car car = new Car();
        LocalDate dateOfExpire = LocalDate.of(2025, 12, 01);
        //when
        boolean result = car.isConsumptionNegative();
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void schouldBeDateOutOfMaintenance() {
        //give
        Car car = new Car();
        //when
        boolean result = car.isConsumptionNegative();
        //then
        Assertions.assertTrue(result);
    }
}