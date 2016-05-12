package me.asd.clock;

import me.asd.observer.Observer;

/**
 * Created by chn on 16/4/27.
 */
public class ClockSmile implements Observer {

    public void update() {
        System.out.println(":)");
    }
}
