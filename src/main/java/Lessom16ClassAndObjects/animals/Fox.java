package Lessom16ClassAndObjects.animals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fox extends Animal {
    private boolean rabies;


    public Fox() {

    }

    public Fox(int age, double weight, boolean rabies) {
    }

    @Override
    public void voice() {
        System.out.println("Fox voice");
        if (rabies) {
            System.out.println("💀💀💀");
        }
    }
}
