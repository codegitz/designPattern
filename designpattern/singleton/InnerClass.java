package com.imooc.netty.designpattern.singleton;

/**
 * @description: 静态内部类方式
 * @author: Codegitz
 * @create: 2020-05-17 09:48
 **/
public class InnerClass {
    //私有化构造方法
    private InnerClass(){
        System.out.println("Initializing InnerClass....");
    }

    //通过内部类获取InnerClass对象
    public static class InnerSingletonInstance{
        private static final InnerClass innerClass = new InnerClass();
    }

    //提供返回实例方法，此方法没有sync，想想通过什么保证了唯一？
    public static InnerClass getInstance(){
        System.out.println("get InnerClass Instance......");
        return InnerSingletonInstance.innerClass;
    }

    public static void main(String[] args) {
        InnerClass instance1 = InnerClass.getInstance();
        InnerClass instance2 = InnerClass.getInstance();
        //预测返回为true
        System.out.println(instance1 == instance2);
    }

}
