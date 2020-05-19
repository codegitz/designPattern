package com.imooc.netty.designpattern.factorymethod;

/**
 * @description: ConcreteProduct2 产品2
 * @author: Codegitz
 * @create: 2020-05-17 13:40
 **/
public class ConcreteProduct2 implements AbstractProduct{
    @Override
    public void product() {
        System.out.println("ConcreteProduct2 in production.....");
    }
}
