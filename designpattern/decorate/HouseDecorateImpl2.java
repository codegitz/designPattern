package com.imooc.netty.designpattern.decorate;

/**
 * @description: {@link HouseDecorate}房屋装饰类具体实现类
 * @author: Codegitz
 * @create: 2020-05-19 15:36
 **/
public class HouseDecorateImpl2 extends HouseDecorate {
    public HouseDecorateImpl2(House house) {
        super(house);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("HouseDecorateImpl2 do something...");
    }
}
