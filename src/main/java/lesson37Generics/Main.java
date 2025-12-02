package lesson37Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> list = new ArrayList<>();

        list.add(1);

        Integer element = list.get(0);

        System.out.println(element);
    }
}
