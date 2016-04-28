/**
 * Created by chn on 16/4/27.
 */
public class ClockSource extends Clock implements Observable {

    // delegate
    Subject observable = new Subject(); // DIP. FACTORY.

    public void registerObserver(Observable timeSink) {
        observable.registerObserver(timeSink);
    }

    public void setTime(int hour, int minute, int second) {
        super.setTime(hour, minute, second);
        notifyObservers();
    }

    public void tic() {
        super.tic();
        notifyObservers();
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void update() {
    }
}
