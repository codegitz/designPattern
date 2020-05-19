package com.imooc.netty.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: {@link Subject}被观察对象,可注册唤醒{@link Observer}观察者
 * @author: Codegitz
 * @create: 2020-05-19 22:17
 **/
public class Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();
    }

    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
        this.notifyAllObserver();
    }

    public void notifyAllObserver(){
        for (Observer observer: observers){
            observer.update(this);
        }
    }


}
