package me.asd.clock;

/**
 * Created by chn on 16/4/27.
 */
public class Clock implements TimeSource {
    int hour = 0;
    int minute  = 0;
    int second = 0;

    public void setTime(int hour, int min, int sec) {
        this.hour = hour;
        this.minute = min;
        this.second = sec;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tic() {
        if(++second == 60) {
            second = 0;
            if(++minute == 60) {
                minute = 0;
                if(++hour == 24) {
                    hour = 0;
                }
            }
        }
    }
}
