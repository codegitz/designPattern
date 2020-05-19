package com.imooc.netty.designpattern.simplefactory;

import io.netty.util.internal.StringUtil;

/**
 * @description: 简单工厂
 * @author: Codegitz
 * @create: 2020-05-17 13:10
 **/
public class SimpleFactory {

    public static AbstractProduct creatProdution(String name){
        if (StringUtil.isNullOrEmpty(name)){
            return null;
        }
        if (name.equals("product1")){
            return new ConcreteProduct1();
        }else if (name.equals("product2")){
            return new ConcreteProduct2();
        }else {
            throw new RuntimeException("么有这个产品");
        }

    }
}
