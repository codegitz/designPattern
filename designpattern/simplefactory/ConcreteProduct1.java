package com.imooc.netty.designpattern.simplefactory;

/**
 * @description: 产品1
 * @author: Codegitz
 * @create: 2020-05-17 13:08
 **/
public class ConcreteProduct1 implements AbstractProduct {
    @Override
    public void product() {
        System.out.println(" ConcreteProduct1 in production....");
    }
}
