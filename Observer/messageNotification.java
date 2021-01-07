import java.time.LocalTime;

public class messageNotification implements Observer, displayNotify {
    private String babyCondition = "Cry";
    private String notificationDisplay;
    private babyBox box;

    public messageNotification(babyBox box) {
        this.box = box;
        box.addObserver(this);
    }

    public void update(LocalTime time, String notification) {
        notificationDisplay = babyCondition;
        babyCondition = notification;

        display();
    }

    public void display() {
        if (babyCondition.equals("oek oek oek")) {
            System.out.println("Cry");
        }

        else if (babyCondition.equals("haha haha haha")) {
            System.out.println("Laugh");
        }
    }
}
