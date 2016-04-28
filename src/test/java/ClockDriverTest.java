import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chn on 16/4/27.
 */
public class ClockDriverTest {

    MockClockSource mockClockSource;
    MockClockSink mockClockSink;

    @Before
    public void setUp() {
        mockClockSource = new MockClockSource();
        mockClockSink = new MockClockSink(mockClockSource);
        mockClockSource.registerObserver(mockClockSink);

    }

    @Test
    public void testTimeChange() {

        mockClockSource.setTime(1,2,3);
        assertSinkEquals(mockClockSink.getHour(), mockClockSink.getMinute(), mockClockSink.getSecond());

        mockClockSource.setTime(4,5,6);
        assertSinkEquals(mockClockSink.getHour(), mockClockSink.getMinute(), mockClockSink.getSecond());
    }

    private void assertSinkEquals(int actual, int actual2, int actual3) {
        assertEquals(mockClockSink.getHour(), actual);
        assertEquals(mockClockSink.getMinute(), actual2);
        assertEquals(mockClockSink.getSecond(), actual3);
    }

    @Test
    public void testMultiSink() {
        MockClockSink sink2 = new MockClockSink(mockClockSource);
        mockClockSource.registerObserver(sink2);

        mockClockSource.setTime(4,5,6);
        assertSinkEquals(mockClockSink.getHour(), mockClockSink.getMinute(), mockClockSink.getSecond());
        assertSinkEquals(sink2.getHour(), sink2.getMinute(), sink2.getSecond());
    }

}
