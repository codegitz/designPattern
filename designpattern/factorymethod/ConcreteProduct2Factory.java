package com.imooc.netty.designpattern.factorymethod;

/**
 * @description: ConcreteProduct2Factory 生产产品2的具体工厂
 * @author: Codegitz
 * @create: 2020-05-17 13:41
 **/
public class ConcreteProduct2Factory implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProduct2();
    }
}
