package Lessom16ClassAndObjects;

import Lessom16ClassAndObjects.animals.Cat;
import Lessom16ClassAndObjects.animals.Fox;

public class Main2 {
    static void main() {
        Fox fox = new Fox();
        Cat cat = new Cat();


        cat.setName("Cat");
        cat.setAge(18);
        cat.setWeight(12);
        cat.voice();

        fox.setRabies(true);
        fox.setAge(30);
        fox.setWeight(1.5);
        fox.voice();
    }
}
