package com.imooc.netty.designpattern.templatemethod;

/**
 * @description: {@link BankTemplateMethod} 模板方法,模板中把办理业务用作核心部分
 * 让子类来实现{@link BankTemplateMethod#transact()}方法，
 * 所以这是一个抽象类,需要{@link DrawMoney#transact()}具体实现
 * @author: Codegitz
 * @create: 2020-05-18 15:52
 **/
public abstract class BankTemplateMethod {

    public void takeNum(){
        System.out.println("takeNumber...");
    }

    public abstract void transact();

    public void feedBack(){
        System.out.println("feedBack....");
    }

    public void process(){
        takeNum();
        transact();
        feedBack();
    }

}
