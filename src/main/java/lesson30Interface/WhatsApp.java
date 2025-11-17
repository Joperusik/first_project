package lesson30Interface;

public class WhatsApp implements Messenger {
    @Override
    public boolean sendMessage(String message) {
        System.out.println("WhatsApp sendMessage " + message);

        if (message == null) {
            System.out.println("WhatsApp sendMessage null");
            return false;
        }

        return false;
    }

    @Override
    public void readMessage(String message) {
        System.out.println(message);
    }
}
