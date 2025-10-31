package lesson19Lombok;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private String name;
    private double salary;
    private int yearsOfExperience;

    public Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isJunior() {
        if (yearsOfExperience <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public double getBonus() {
        return salary / 10;
    }

}
