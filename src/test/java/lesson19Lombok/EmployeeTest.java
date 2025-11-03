package lesson19Lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void shouldBeJunior() {
        // given
        Employee employee = new Employee("Vasyl", 50_000, 1);

        //when
        boolean result = employee.isJunior();

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotBeJunior() {
        // given
        Employee employee = new Employee("Vasyl", 50_000, 3);

        //when
        boolean result = employee.isJunior();

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldBeBonus() {
        //give
        Employee employee = new Employee("Vasyl", 50_000, 3);

        //when
        double bonus = employee.getBonus();

        //then
        Assertions.assertEquals(5_000, bonus);

    }
}