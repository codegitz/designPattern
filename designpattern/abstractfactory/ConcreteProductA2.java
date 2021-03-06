package com.imooc.netty.designpattern.abstractfactory;

/**
 * @description: 产品A1实现
 * @author: Codegitz
 * @create: 2020-05-17 14:18
 **/
public class ConcreteProductA2 implements AbstractProductA {
    @Override
    public void run() {
        System.out.println("ConcreteProductA2 run....");
    }

    @Override
    public void start() {
        System.out.println("ConcreteProductA2 start...");
    }
}
