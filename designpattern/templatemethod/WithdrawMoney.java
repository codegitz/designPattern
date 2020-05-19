package com.imooc.netty.designpattern.templatemethod;

/**
 * @description: {@link BankTemplateMethod}模板方法实现类
 * @author: Codegitz
 * @create: 2020-05-18 15:57
 **/
public class WithdrawMoney extends BankTemplateMethod{
    @Override
    public void transact() {
        System.out.println("WithdrawMoney....");
    }
}
