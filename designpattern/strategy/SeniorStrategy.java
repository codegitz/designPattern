package com.imooc.netty.designpattern.strategy;

/**
 * @description: 高级会员
 * @author: Codegitz
 * @create: 2020-05-19 17:12
 **/
public class SeniorStrategy implements Strategy {
    @Override
    public void gogogo() {
        System.out.println("SeniorStrategy discount....");
    }
}
