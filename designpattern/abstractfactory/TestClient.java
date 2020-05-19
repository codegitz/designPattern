package com.imooc.netty.designpattern.abstractfactory;

/**
 * @description: 测试抽象工厂
 * @author: Codegitz
 * @create: 2020-05-17 14:26
 **/
public class TestClient {
    public static void main(String[] args) {
        //创建具体工厂
        AbstractFactory abstractFactory = new ConcreteFactory1();
        //通过具体工厂创建产品
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
        productA.run();
        productA.start();
        productB.run();
    }
}
