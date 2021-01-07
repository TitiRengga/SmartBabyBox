import java.util.*;
import java.time.LocalTime;

public class babyBox implements subject {
    private ArrayList<Observer> observers;
    private LocalTime time;
    private String notification;

    public babyBox() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(time, notification);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(LocalTime time, String notification) {
        this.time = time;
        this.notification = notification;
        measurementsChanged();
    }

    public LocalTime getTime() {
        return time;
    }

    public String getNotification() {
        return notification;
    }

}
