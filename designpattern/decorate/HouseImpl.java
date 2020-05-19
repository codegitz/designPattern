package com.imooc.netty.designpattern.decorate;

/**
 * @description: 房屋基类实现类
 * @author: Codegitz
 * @create: 2020-05-19 15:37
 **/
public class HouseImpl implements House {
    @Override
    public void build() {
        System.out.println("start build....");
    }
}
