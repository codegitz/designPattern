package com.imooc.netty.designpattern.reflect;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        Class<?> forName = Class.forName("com.imooc.netty.designpattern.reflect.UserEntity");
        UserEntity userEntity = (UserEntity) forName.newInstance();
        System.out.println(userEntity);
    }
}
