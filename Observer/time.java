import java.time.LocalTime;

public class time implements Observer, displayNotify {
    private LocalTime timenow = LocalTime.now();
    private babyBox box;

    public time(babyBox box) {
        this.box = box;
        box.addObserver(this);
    }

    public void update(LocalTime time, String notification) {
        timenow = time;
        display();
    }

    public void display() {
        System.out.println("Time: " + timenow + "\nyour baby is crying" + "\ntake care your baby soon !!!");
    }
}
