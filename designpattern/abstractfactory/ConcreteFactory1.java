package com.imooc.netty.designpattern.abstractfactory;

/**
 * @description: 具体工厂1
 * @author: Codegitz
 * @create: 2020-05-17 14:16
 **/
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
