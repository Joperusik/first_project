package Lessom16ClassAndObjects.animals;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cat))
            return false;

        Cat otherCat = (Cat) obj;

//        if (this.name == null)
//            return otherCat.name == null;
        if(this.name == null) {
        }

        return this.age == otherCat.age
                && this.weight == otherCat.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }
}
