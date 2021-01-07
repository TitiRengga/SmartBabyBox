mport java.time.LocalTime;

public class babyBoxTest {

    public static void main(String[] args) {
        babyBox box = new babyBox();

        time tm = new time(box);
        messageNotification babyCondition = new messageNotification(box);

        box.setMeasurements(LocalTime.now(), "Cry");
    }
}
