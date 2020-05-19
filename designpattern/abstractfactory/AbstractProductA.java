package com.imooc.netty.designpattern.abstractfactory;

/**
 * @description: 抽象产品A，需要交由具体产品{@link ConcreteProductA1}{@link ConcreteProductA2}实现
 * @author: Codegitz
 * @create: 2020-05-17 14:12
 **/
public interface AbstractProductA {

    //随便定义两个方法，让具体产品实现
    void run();

    void start();
    
}
