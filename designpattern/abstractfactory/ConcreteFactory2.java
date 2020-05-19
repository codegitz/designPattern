package com.imooc.netty.designpattern.abstractfactory;

/**
 * @description: 具体工厂2
 * @author: Codegitz
 * @create: 2020-05-17 14:16
 **/
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
