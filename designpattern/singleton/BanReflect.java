package com.imooc.netty.designpattern.singleton;

/**
 * @description: 防止反射攻击
 * @author: Codegitz
 * @create: 2020-05-17 10:49
 **/
public class BanReflect {
    public static boolean flag = true;

    private BanReflect(){
        //...只允许创建一次
        if (flag){
            flag = !flag;
        }else {
            throw new RuntimeException("二次创建，违反了单例模式");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //先初始化一次
        BanReflect banReflect1 = new BanReflect();
        //再使用反射进行获取一次
        Class<?> aClass = Class.forName("com.imooc.netty.designpattern.singleton.BanReflect");
        //获取实例
        BanReflect banReflect2 = (BanReflect) aClass.newInstance();
        //测试结果
        System.out.println(banReflect1 == banReflect2);
    }
}
