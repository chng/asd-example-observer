package me.asd.clock;

import me.asd.observer.Observable;

/**
 * Created by chn on 16/4/27.
 */
public class ClockSmile implements Observable {

    public void update() {
        System.out.println(":)");
    }
}