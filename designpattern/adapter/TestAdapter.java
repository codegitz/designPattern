package com.imooc.netty.designpattern.adapter;

/**
 * @description: 测试电源适配器
 * @author: Codegitz
 * @create: 2020-05-18 17:03
 **/
public class TestAdapter {
    public static void main(String[] args) {

        //220v的实现
        CN220Interface cn220Interface = new CN220InterfaceImpl();
        //通过构造函数传入，进行规格转换
        PowerAdapter powerAdapter = new PowerAdapter(cn220Interface);
        //可把移花接木过的powerAdapter传入110v规格的电饭煲中，此时可以正常工作
        ElectricCooker electricCooker = new ElectricCooker(powerAdapter);
        electricCooker.cook();
    }
}
