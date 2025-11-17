package lesson30Interface;

public class Viber implements Add {
    @Override
    public void showAdd(String text) {
        System.out.println("ADD from Viber 💀💀: " + text);

    }

    public boolean sendMessage(String message) {
        System.out.println("Viber sendMessage " + message);

        if (message == null) {
            System.out.println("Viber sendMessage null");
            return false;
        }

        return false;
    }


    public void readMessage(String message) {
        System.out.println(message);
    }
}
