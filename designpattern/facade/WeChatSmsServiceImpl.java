package com.imooc.netty.designpattern.facade;

/**
 * @description: 邮件消息服务接口实现
 * @author: Codegitz
 * @create: 2020-05-18 22:10
 **/
public class WeChatSmsServiceImpl implements WechatSmsService {
    @Override
    public void send() {
        System.out.println("WeChatSmsServiceImpl send....");
    }
}
