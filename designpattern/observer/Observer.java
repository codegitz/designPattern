package com.imooc.netty.designpattern.observer;

/**
 * @description: {@link Observer}观察者接口，用来存放观察者共有方法,由{@link ObserverA},{@link ObserverB}等实现
 * @author: Codegitz
 * @create: 2020-05-19 22:16
 **/
public interface Observer {
    void update(Subject subject);
}
