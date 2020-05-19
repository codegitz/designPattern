package com.imooc.netty.designpattern.adapter;

/**
 * @description: {@link CN220InterfaceImpl}实现220V{@link CN220Interface}接口
 * @author: Codegitz
 * @create: 2020-05-18 17:03
 **/
public class CN220InterfaceImpl implements CN220Interface {
    @Override
    public void connect() {
        System.out.println("CN220Interface start to work....");
    }
}
