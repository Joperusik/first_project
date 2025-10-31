package lesson19Lombok;

public class Main {
    static void main() {
        Employee employee = new Employee("Vasyl", 50_000, 1);

        System.out.println(employee.isJunior());
        System.out.println(employee.getBonus());
    }
}
