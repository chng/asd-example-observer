package me.asd.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by chn on 16/4/27.
 */
public class Subject {

    List<Observer> clockSinks = Lists.newLinkedList();

    public void notifyObservers() {
        if(clockSinks!=null) {
            for (Observer clockObserver : clockSinks) {
                clockObserver.update();
            }
        }
    }

    public void registerObserver(Observer timeSink) {
        clockSinks.add(timeSink);
    }

//    public void update() {
//
//    }
}
