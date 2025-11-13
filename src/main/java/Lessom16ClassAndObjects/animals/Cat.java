package Lessom16ClassAndObjects.animals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal {
    private String name;

    public Cat() {
    }

    // конструктор с параметрами
    public Cat(String name, int age, double weight) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Cat voice");
    }
}
