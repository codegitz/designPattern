package com.imooc.netty.designpattern.strategy;

/**
 * @description: 测试类
 * @author: Codegitz
 * @create: 2020-05-19 17:16
 **/
public class TestStrategy {
    public static void main(String[] args) {
        Context context = new Context(new JuniorStrategy());
        System.out.println("========JuniorStrategy========");
        context.discount();
        System.out.println("==========InterMediateStrategy========");
        context = new Context(new InterMediateStrategy());
        context.discount();
        System.out.println("=======SeniorStrategy=========");
        context = new Context(new SeniorStrategy());
        context.discount();
    }
}
