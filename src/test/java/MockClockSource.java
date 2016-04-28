import me.asd.clock.TimeSource;
import me.asd.observer.Subject;

/**
 * Created by chn on 16/4/27.
 */
public class MockClockSource extends Subject implements TimeSource {

    int hour = 0;
    int minute  = 0;
    int second = 0;

    public void setTime(int hour, int min, int sec) {
        this.hour = hour;
        this.minute = min;
        this.second = sec;
        super.notifyObservers();
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
}
