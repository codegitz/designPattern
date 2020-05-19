package com.imooc.netty.designpattern.adapter;

/**
 * @description: {@link}适配{@link JP110Interface}的电饭煲
 * @author: Codegitz
 * @create: 2020-05-18 17:03
 **/
public class ElectricCooker {
    private JP110Interface jp110Interface;

    public ElectricCooker(JP110Interface jp110Interface){
        this.jp110Interface = jp110Interface;
    }

    public void cook(){
        jp110Interface.connect();
        System.out.println("start to cook....");
    }
}
