package com.imooc.netty.designpattern.templatemethod;

public class MobileTemplate extends MsgTemplate {
    @Override
    public void dealing() {
        System.out.println("mobile msg....");
    }
}
