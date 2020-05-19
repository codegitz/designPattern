package com.imooc.netty.designpattern.observer;

/**
 * @description: 测试类
 * @author: Codegitz
 * @create: 2020-05-19 22:40
 **/
public class TestObserver {
    public static void main(String[] args) {
        //新建一个被观察对象
        Subject subject = new Subject();
        //三个不同的观察者
        Observer observer1 = new ObserverA();
        Observer observer2 = new ObserverB();
        Observer observer3 = new ObserverC();

        //注册三个观察者
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        //改变state的值
        System.out.println("=======change state value,set state = 100==========");
        subject.setState(100);

        System.out.println("============remove observer3============");
        subject.removeObserver(observer3);
        System.out.println("=======change state value,set state = 200==========");
        subject.setState(200);
    }
}
