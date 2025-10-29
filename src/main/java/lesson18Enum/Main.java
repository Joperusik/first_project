package lesson18Enum;

public class Main {
    static void main() {
        Cat cat = new Cat("Name", 15, 1.5, Breed.CARACAL);
        cat.setBreed(Breed.SERVAL);
        System.out.println(cat);
        //System.out.println("Breed is " + cat.getBreed());

        Breed[] breed = Breed.values();
        for (Breed breed1 : breed) {
            System.out.println(breed1);
        }

        Breed catBreed = cat.getBreed();
        switch (catBreed) {
            case CARACAL -> System.out.println("Breed is Caracal");
            case SERVAL -> System.out.println("Breed is Serval");
        }
    }
}
