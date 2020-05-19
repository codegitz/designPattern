package com.imooc.netty.designpattern.abstractfactory;

/**
 * @description: 抽象工厂，需要由具体工厂{@link ConcreteFactory1} {@link ConcreteFactory2}实现
 * @author: Codegitz
 * @create: 2020-05-17 14:12
 **/
public interface AbstractFactory {
    //定义生产产品的方法，交由具体工厂去实现
    AbstractProductA createProductA();
    AbstractProductB createProductB();
}
