package com.imooc.netty.designpattern.observer;

/**
 * @description: 观察者A，实现{@link Observer}
 * @author: Codegitz
 * @create: 2020-05-19 22:30
 **/
public class ObserverA implements Observer {

    private Subject subject;
    @Override
    public void update(Subject subject) {
        this.subject = subject;
        getMyState();
    }

    public void getMyState(){
        System.out.println("[Observer name: "+this.getClass().getName()+"]--subject.getState(): "+subject.getState());
    }
}
