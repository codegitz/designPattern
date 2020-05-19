package com.imooc.netty.designpattern.abstractfactory;

/**
 * @description: 产品B2实现
 * @author: Codegitz
 * @create: 2020-05-17 14:18
 **/
public class ConcreteProductB2 implements AbstractProductB {
    @Override
    public void run() {
        System.out.println("ConcreteProductB2 run....");
    }
}
