package com.imooc.netty.designpattern.adapter;

/**
 * @description: {@link PowerAdapter}定义一个电源适配器，适配器实现{@link JP110Interface},同时内部维护一个{@link CN220Interface}
 * 在实现{@link JP110Interface#connect()}的方法时，用{@link CN220Interface#connect()}方法代替
 * @author: Codegitz
 * @create: 2020-05-18 17:03
 **/
public class PowerAdapter implements JP110Interface {

    private CN220Interface cn220Interface;

    public PowerAdapter(CN220Interface cn220Interface){
        this.cn220Interface = cn220Interface;
    }
    @Override
    public void connect() {
        cn220Interface.connect();
    }
}
