package com.imooc.netty.designpattern.singleton;

/**
 * @description: 枚举单例模式
 * @author: Codegitz
 * @create: 2020-05-17 10:30
 **/
public class EnumSingleton {
    //私有化构造方法
    private EnumSingleton(){}

    //提供返回实例的方法
    public static EnumSingleton getInstance(){
        return EnumSingletonDemo.INSTANCE.getInstance();
    }
    //通过枚举获取实例
    static enum EnumSingletonDemo{
        INSTANCE;
        private EnumSingleton enumSingleton;
        //利用枚举只初始化一次给对象实例化
        private EnumSingletonDemo(){
            enumSingleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return this.enumSingleton;
        }
    }
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.getInstance();
        EnumSingleton instance2 = EnumSingleton.getInstance();
        //预测为true
        System.out.println(instance1 == instance2);
    }
}
