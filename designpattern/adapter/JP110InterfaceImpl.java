package com.imooc.netty.designpattern.adapter;

/**
 * @description: {@link JP110InterfaceImpl}实现110V{@link JP110Interface}接口
 * @author: Codegitz
 * @create: 2020-05-18 17:03
 **/
public class JP110InterfaceImpl implements JP110Interface {
    @Override
    public void connect() {
        System.out.println("JP110Interface start to work....");
    }
}
