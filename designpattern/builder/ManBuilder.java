package com.imooc.netty.designpattern.builder;

/**
 * @description: 抽象{@link Builder}类的具体实现
 * @author: Codegitz
 * @create: 2020-05-18 15:28
 **/
public class ManBuilder implements Builder {

    private Person person;

    public ManBuilder(){
        //创建对象，用set方法赋值
        this.person = new Person();
    }
    @Override
    public void buildHead() {
        person.setHead("headA");
    }

    @Override
    public void buildBody() {
        person.setBody("bodyA");
    }

    @Override
    public void buildFoot() {
        person.setFoot("footA");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
