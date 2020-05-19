package com.imooc.netty.designpattern.singleton;

/**
 * @description: 懒汉式
 * @author: Codegitz
 * @create: 2020-05-17 09:30
 **/
public class Lazy {

    //先定义，但是没有初始化
    private static Lazy lazy;

    //私有化构造方法
    private Lazy(){}

    //获取实例，需要保证线程安全问题
    public synchronized static Lazy getInstance(){
        //判断是否为null，为null则初始化，否则直接返回
        if (lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }

    public static void main(String[] args) {
        Lazy lazy1 = Lazy.getInstance();
        Lazy lazy2 = Lazy.getInstance();
        //测试两个是否为同一个对象，预测为true
        System.out.println(lazy1 == lazy2);
    }
}
