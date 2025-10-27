package Lessom16ClassAndObjects.animals;

public class Cat {
    private String name;
    private int age;
    private double weight;

    public Cat() {
    }

    // конструктор с параметрами
    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Name
    public String getName() {
        return name;
    }

    public void setName(String name) { //всегда воид, так как ничего не возвращяет
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

    public String toString() {
        return "Name " + this.name + ", Age " + this.age + ", Weight " + this.weight;
    }
}
