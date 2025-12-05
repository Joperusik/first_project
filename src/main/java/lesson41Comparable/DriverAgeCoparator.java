package lesson41Comparable;

import java.util.Comparator;

public class DriverAgeCoparator implements Comparator<Driver> {
    @Override
    public int compare(Driver first, Driver secont) {
        return Integer.compare(first.getAge(), secont.getAge());
    }
}
