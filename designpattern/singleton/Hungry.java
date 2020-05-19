package com.imooc.netty.designpattern.singleton;

/**
 * @description: 饿汉式
 * @author: Codegitz
 * @create: 2020-05-17 09:30
 **/
public class Hungry {

    //直接初始化，static保证全局唯一，final保证不允许被修改
    private static final Hungry HUNGRY = new Hungry();

    //私有构造方法
    private Hungry(){}

    //提供返回实例的方法
    public static Hungry getInstance(){return HUNGRY;}

    public static void main(String[] args) {
        Hungry l1 = HUNGRY.getInstance();
        Hungry l2 = HUNGRY.getInstance();
        //测试两个实例是否一样，预测为true
        System.out.println(l1 == l2);
    }
}
