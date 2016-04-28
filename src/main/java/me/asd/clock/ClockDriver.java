//import com.google.common.collect.Lists;
//
//import java.util.List;
//
///**
// * Created by chn on 16/4/27.
// */
//public class ClockDriver implements ClockObserver {
//
//    List<ClockObserver> clockSinks = Lists.newLinkedList();
//
//    public void registerObserver(ClockObserver timeSink) {
//        clockSinks.add(timeSink);
//    }
//
//    public ClockDriver(Subject source) {
//        source.setClockDriver(this);
//    }
//
//
//    public void update(int hour, int minute, int second) {
//        for(ClockObserver clockSink: clockSinks) {
//            clockSink.update(hour, minute, second);
//            clockSink.updated();
//        }
//    }
//
//    public void updated() {
//
//    }
//}
