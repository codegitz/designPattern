package com.imooc.netty.designpattern.simplefactory;

/**
 * @description: 产品2
 * @author: Codegitz
 * @create: 2020-05-17 13:08
 **/
public class ConcreteProduct2 implements AbstractProduct {
    @Override
    public void product() {
        System.out.println(" ConcreteProduct2 in production....");
    }
}
