package com.imooc.netty.designpattern.templatemethod;

public class Test {
    public static void main(String[] args) {
        BankTemplateMethod drawMoney = new DrawMoney();
        BankTemplateMethod withdrawMoney = new WithdrawMoney();
        System.out.println("===========drawMoney.process()===========");
        drawMoney.process();
        System.out.println("==========withdrawMoney.process===========");
        withdrawMoney.process();
    }
}
