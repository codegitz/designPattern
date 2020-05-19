package com.imooc.netty.designpattern.decorate;

/**
 * @description: 房屋装饰类
 * @author: Codegitz
 * @create: 2020-05-19 15:18
 **/
public class HouseDecorate implements House{

    private House house;

    public HouseDecorate(House house){
        this.house = house;
    }
    @Override
    public void build() {
        house.build();
    }
}
