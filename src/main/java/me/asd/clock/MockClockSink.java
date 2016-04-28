package me.asd.clock;

import me.asd.observer.Observable;

/**
 * Created by chn on 16/4/27.
 */
public class MockClockSink implements Observable {

    int hour = 0;
    int minute  = 0;
    int second = 0;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    TimeSource timeSource;

    public MockClockSink(TimeSource source) {
        timeSource = source;
    }

    public void update() {
        this.hour = timeSource.getHour();
        this.minute = timeSource.getMinute();
        this.second = timeSource.getSecond();
    }
}
