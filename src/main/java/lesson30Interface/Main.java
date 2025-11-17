package lesson30Interface;

public class Main {
    static void main () {

        WhatsApp whatsApp = new WhatsApp();
        boolean result = whatsApp.sendMessage("Hello World");
        System.out.println("Delivery status: " + result);

        boolean resut1 = whatsApp.sendMessage(null);
        System.out.println("Delivery status: " + resut1);


        whatsApp.readMessage("Sup");


        Viber viber = new Viber();
        viber.showAdd("❤️❤️❤️❤️");

        viber.sendMessage("something");
        viber.showAdd();
    }
}
