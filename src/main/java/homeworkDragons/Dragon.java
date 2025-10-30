package homeworkDragons;

public class Dragon {
    private String name;
    private int age;
    private double weight;
    private Breed breed;

    public Dragon() {
        System.out.println("without constructor");
        System.out.println();
    }

    // конструктор с параметрами
    public Dragon(String name, int age, double weight) {
        System.out.println("With constructor");
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println();
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

    //Breed
    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    //voice
    public void voice() {
        System.out.println("*Dragons cant talk*");
    }

    //fire
    public void fire() {
        System.out.println("🔥🔥🔥🔥");
    }

    public String toString() {
        return "Dragon " +
                "Name = " + name +
                ", Age = " + age +
                ", Weight = " + weight +
                ", Breed = " + breed;
    }
}
