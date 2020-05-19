package com.imooc.netty.designpattern.abstractfactory;

/**
 * @description: 产品B1实现
 * @author: Codegitz
 * @create: 2020-05-17 14:18
 **/
public class ConcreteProductB1 implements AbstractProductB {
    @Override
    public void run() {
        System.out.println("ConcreteProductB1 run....");
    }
}
