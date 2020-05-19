package com.imooc.netty.designpattern.decorate;

/**
 * @description: 测试类
 * @author: Codegitz
 * @create: 2020-05-19 15:38
 **/
public class Test {
    public static void main(String[] args) {
        House house = new HouseImpl();
        System.out.println("======without decorate======");
        house.build();
        HouseDecorate houseDecorate1 = new HouseDecorateImpl1(house);
        HouseDecorate houseDecorate2 = new HouseDecorateImpl2(house);
        System.out.println("=====HouseDecorateImpl1 decorate====");
        houseDecorate1.build();
        System.out.println("=====HouseDecorateImpl2 decorate====");
        houseDecorate2.build();
    }
}
