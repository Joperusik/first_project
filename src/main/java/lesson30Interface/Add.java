package lesson30Interface;

public interface Add {

    void showAdd(String text);

    default void showAdd() {
        System.out.println("Default showAdd");
    }

}
