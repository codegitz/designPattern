package com.imooc.netty.designpattern.decorate;

/**
 * @description: 房屋装饰类具体实现类
 * @author: Codegitz
 * @create: 2020-05-19 15:36
 **/
public class HouseDecorateImpl1 extends HouseDecorate {
    public HouseDecorateImpl1(House house) {
        super(house);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("HouseDecorateImpl1 do something...");
    }
}
