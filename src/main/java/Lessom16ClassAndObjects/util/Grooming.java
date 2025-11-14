package Lessom16ClassAndObjects.util;

import Lessom16ClassAndObjects.animals.Animal;
import Lessom16ClassAndObjects.animals.Fox;

public class Grooming {
    
    private String name;
    
    public Grooming(String name) {
        this.name = name;
    }
    
    public void groom(Animal animal) {

        if (animal instanceof Fox) {
            Fox fox = (Fox) animal;
            if (fox.isRabies()) {
                System.out.println("Nah you rebies");
            } else  {
                animal.voice();
                System.out.println("grooming");
            }
        }

    }
    
}
