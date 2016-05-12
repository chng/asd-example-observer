package me.asd.clock;

import me.asd.observer.Observer;

/**
 * Created by chn on 16/4/27.
 */
public class ClockSink implements Observer {

    int hour = 0;
    int minute  = 0;
    int second = 0;

    TimeSource timeSource;
    public ClockSink(TimeSource timeSource) {
        this.timeSource = timeSource;
    }

    public void update() {
        this.hour = timeSource.getHour();
        this.minute = timeSource.getMinute();
        this.second = timeSource.getSecond();
        System.out.println(hour+":"+minute+":"+second);
    }
}
