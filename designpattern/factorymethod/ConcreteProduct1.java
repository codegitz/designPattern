package com.imooc.netty.designpattern.factorymethod;

/**
 * @description: ConcreteProduct1 产品1
 * @author: Codegitz
 * @create: 2020-05-17 13:40
 **/
public class ConcreteProduct1 implements AbstractProduct{
    @Override
    public void product() {
        System.out.println("ConcreteProduct1 in production.....");
    }
}
