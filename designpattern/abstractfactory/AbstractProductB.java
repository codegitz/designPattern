package com.imooc.netty.designpattern.abstractfactory;

/**
 * @description: 抽象产品B,需要交由具体产品{@link ConcreteProductB1}{@link ConcreteProductB2}实现
 * @author: Codegitz
 * @create: 2020-05-17 14:12
 **/
public interface AbstractProductB {
    //随便定义个方法，让具体产品实现
    void run();
}
