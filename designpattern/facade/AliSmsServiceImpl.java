package com.imooc.netty.designpattern.facade;

/**
 * @description: 阿里消息服务接口实现
 * @author: Codegitz
 * @create: 2020-05-18 22:10
 **/
public class AliSmsServiceImpl implements AliSmsService {
    @Override
    public void send() {
        System.out.println("AliSmsServiceImpl send....");
    }
}
