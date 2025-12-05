package lesson41Comparable;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Driver implements Comparable<Driver> {
    private String name;
    private int points;
    private int age;


    @Override
    public int compareTo(Driver otherDriver) {
        if (this.points == otherDriver.points) {// if point are same
            return Integer.compare(this.age, otherDriver.age);// then for age
        } else  {
            return Integer.compare(this.points, otherDriver.points); // if point are not the same
        }
    }

}
