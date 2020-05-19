package com.imooc.netty.designpattern.factorymethod;

/**
 * @description: ConcreteProduct1Factory 生产产品1的具体工厂
 * @author: Codegitz
 * @create: 2020-05-17 13:41
 **/
public class ConcreteProduct1Factory implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProduct1();
    }
}
