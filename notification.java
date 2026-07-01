class Notification {
    void send() {
        System.out.println("Sending a general notification");
    }
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending notification through Email");
    }
}

class SMSNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending notification through SMS");
    }
}

class WhatsAppNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending notification through WhatsApp");
    }
}

public class notification{
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        Notification n3 = new WhatsAppNotification();

        n1.send();
        n2.send();
        n3.send();
    }
}