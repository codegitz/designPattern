package com.imooc.netty.designpattern.facade;

/**
 * @description: 门面类，提供一个隐藏系统复杂性的接口
 * @author: Codegitz
 * @create: 2020-05-18 22:15
 **/
public class Facade {
    private AliSmsService aliSmsService;
    private EmailSmsService emailSmsService;
    private WechatSmsService wechatSmsService;

    public Facade(){
        aliSmsService = new AliSmsServiceImpl();
        emailSmsService = new EmailSmsServiceImpl();
        wechatSmsService  = new WeChatSmsServiceImpl();
    }

    //提供一个接口，屏蔽系统操作复杂性
    public void sendMsg(){
        aliSmsService.send();
        emailSmsService.send();
        wechatSmsService.send();
    }

    public static void main(String[] args) {
        //测试方法
        new Facade().sendMsg();
    }
}
