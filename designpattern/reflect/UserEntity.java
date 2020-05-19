package com.imooc.netty.designpattern.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class UserEntity {
    private String name;
    public UserEntity(){

    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> forName = Class.forName("com.imooc.netty.designpattern.reflect.UserEntity");
        UserEntity userEntity = (UserEntity) forName.newInstance();
        userEntity.setName("hh");
        System.out.println(userEntity.name);
        Method[] method = forName.getMethods();
        for (Method m :
                method) {
            System.out.println(m.getName());
        }
        Field[] declaredFields = forName.getDeclaredFields();
        for (Field d :
                declaredFields) {
            System.out.println(d.getName());
        }
    }
}
