package com.imooc.netty.designpattern.factorymethod;

/**
 * @description: 抽象工厂角色，需要具体工厂{@Link ConcreteProduct1Factory} {@Link ConcreteProduct2Factory}实现
 * @author: Codegitz
 * @create: 2020-05-17 13:36
 **/
public interface AbstractFactory {
     AbstractProduct createProduct();
}
