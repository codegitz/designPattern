package com.imooc.netty.designpattern.singleton;

/**
 * @description: 双重检测锁单例模式
 * @author: Codegitz
 * @create: 2020-05-17 10:30
 **/
public class DoubleCheckSingleton {
    //需要volatile关键字禁止指令重排序，不然双重检测还是会出现线程安全问题
    public static volatile DoubleCheckSingleton singleton ;

    //私有化构造方法
    private DoubleCheckSingleton(){}

    //获取实例
    public static DoubleCheckSingleton getInstance(){
        //判断是否为空,空则进入实例化流程，否则直接返回
        if (singleton == null){
            synchronized (DoubleCheckSingleton.class){
                //获取锁后再进行判断，配合volatile关键字避免多线程环境下出现线程安全问题
                if (singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton2 = DoubleCheckSingleton.getInstance();
        //预测为true
        System.out.println(doubleCheckSingleton1 == doubleCheckSingleton2);
    }
}
