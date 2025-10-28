package lesson17Function;

public class Cat {
    // modifier returnType nameOfMethod (Parameter List){
    // method body
    //}
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

    //voice
    public void voice() {
        System.out.println("Nya");
    }

    public void voice(String word) {
        System.out.println("Nya " + word);
    }

    //eat
    public void eat (String food){
        System.out.println("Give me more  " + food);
    }

}
