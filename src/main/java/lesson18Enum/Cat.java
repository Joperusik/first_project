package lesson18Enum;

public class Cat {

    private String name;
    private int age;
    private double weight;
    private Breed breed;

    public Cat() {
    }

    // конструктор с параметрами
    public Cat(String name, int age, double weight, Breed breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    //Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //breed
    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    //voice
    public void voice() {
        System.out.println("Nya");
    }

    public void voice(String word) {
        System.out.println("Nya " + word);
    }

    //eat
    public void eat(String food) {
        System.out.println("Give me more  " + food);
    }

    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed=" + breed +
                '}';
    }
}


