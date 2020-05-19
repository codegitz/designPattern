package com.imooc.netty.designpattern.builder;

public class WomBuilder implements Builder {

    private Person person;

    public WomBuilder(){
        this.person = new Person();
    }
    @Override
    public void buildHead() {
        person.setHead("headB");
    }

    @Override
    public void buildBody() {
        person.setBody("bodyB");
    }

    @Override
    public void buildFoot() {
        person.setFoot("footB");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
