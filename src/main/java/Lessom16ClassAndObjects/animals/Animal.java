package Lessom16ClassAndObjects.animals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {
    private double weight;
    private int age;

    public void voice() {
        System.out.println("i am animal");
    }

    public Animal() {
    }

    public Animal(double weight, int age) {}
}
