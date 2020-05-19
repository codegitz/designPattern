package com.imooc.netty.designpattern.factorymethod;

/**
 * @description: 测试工厂方法模式
 * @author: Codegitz
 * @create: 2020-05-17 13:49
 **/
public class TestClient {
    public static void main(String[] args) {
        AbstractProduct product1 = new ConcreteProduct1Factory().createProduct();
        AbstractProduct product2 = new ConcreteProduct2Factory().createProduct();
        product1.product();
        product2.product();
    }
}
