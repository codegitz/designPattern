package com.imooc.netty.designpattern.strategy;

/**
 * @description: 初级会员
 * @author: Codegitz
 * @create: 2020-05-19 17:12
 **/
public class JuniorStrategy implements Strategy {
    @Override
    public void gogogo() {
        System.out.println("JuniorStrategy discount....");
    }
}
