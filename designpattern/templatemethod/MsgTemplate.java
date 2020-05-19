package com.imooc.netty.designpattern.templatemethod;

public abstract class MsgTemplate {
    public void sendMsg(){
        before();
        dealing();
        after();
    }

    public void after(){
        System.out.println("after....");
    }

    public abstract void dealing();

    public void before(){
        System.out.println("before...");
    }

}
