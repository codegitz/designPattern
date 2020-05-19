package com.imooc.netty.designpattern.builder;

/**
 * @description: {@link PersonDirector}调用{@link Builder}的实现类去创建具体对象
 * @author: Codegitz
 * @create: 2020-05-18 15:28
 **/
public class PersonDirector {
    public Person creatPerson(Builder builder){
        builder.buildHead();
        builder.buildBody();
        builder.buildFoot();
        return builder.buildPerson();
    }

    public static void main(String[] args) {
        PersonDirector personDirector = new PersonDirector();
        //传入Builder实现类ManBuilder
        Person person = personDirector.creatPerson(new ManBuilder());
        System.out.println(person.toString());
    }
}
