package com.imooc.netty.designpattern.simplefactory;

/**
 * @description: 工厂客户端，使用简单工厂{@Link SimpleFactory}去创建产品
 * @author: Codegitz
 * @create: 2020-05-17 13:16
 **/
public class FactoryClient {
    public static void main(String[] args) {
        //创建产品
        AbstractProduct production1 = SimpleFactory.creatProdution("product1");
        AbstractProduct production2 = SimpleFactory.creatProdution("product2");
        production1.product();
        production2.product();
    }
}
