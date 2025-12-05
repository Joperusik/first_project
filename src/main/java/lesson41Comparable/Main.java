package lesson41Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {


        Driver leclerc = new Driver("Leclerc", 230, 28);
        Driver norris = new Driver("Maria", 408, 28);
        Driver verstappen = new Driver("Verstappen", 296, 30);

        System.out.println(leclerc.compareTo(norris));

        List<Driver> drivers = new ArrayList<Driver>();

        drivers.add(leclerc);
        drivers.add(norris);
        drivers.add(verstappen);

        System.out.println(drivers);

        Collections.sort(drivers, Collections.reverseOrder());

        System.out.println("---After sort (point form high to tow)---");

        System.out.println(drivers);

        Collections.sort(drivers, new DriverAgeCoparator()); // costume class

    }
}
