package me.asd.clock;

/**
 * Created by chn on 16/4/27.
 */
public interface TimeSource {
    int getHour();

    int getMinute();

    int getSecond();
}
