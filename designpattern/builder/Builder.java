package com.imooc.netty.designpattern.builder;

/**
 * @description: 抽象的{@link Builder}类，需要{@link ManBuilder}具体实现
 * @author: Codegitz
 * @create: 2020-05-18 15:28
 **/
public interface Builder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
