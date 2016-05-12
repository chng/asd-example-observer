package me.asd.clock;

import me.asd.observer.Observer;
import me.asd.observer.Subject;

/**
 * Created by chn on 16/4/27.
 */
public class ClockSource extends Clock implements Observer {

    // delegate
    Subject observable = new Subject(); // DIP. FACTORY.

    public void registerObserver(Observer timeSink) {
        observable.registerObserver(timeSink);
    }

    @Override
    public void setTime(int hour, int minute, int second) {
        super.setTime(hour, minute, second);
        notifyObservers();
    }

    @Override
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
