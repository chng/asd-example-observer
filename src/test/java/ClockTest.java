import org.junit.Test;

/**
 * Created by chn on 16/4/27.
 */
public class ClockTest {

    @Test
    public void test() throws InterruptedException {
        ClockSource clockSource = new ClockSource();
        Observable clockSink = new ClockSink(clockSource);
        Observable clockSimle = new ClockSmile();

        clockSource.setTime(0,0,0);
        clockSource.registerObserver(clockSink);
        clockSource.registerObserver(clockSimle);

        int t = 5;
        while(t-- != 0) {
            clockSource.tic();
            Thread.sleep(1000);
        }
    }
}
