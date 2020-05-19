package com.imooc.netty.designpattern.strategy;

/**
 * @description: 上下文匹配策略类
 * @author: Codegitz
 * @create: 2020-05-19 17:14
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void discount(){
        strategy.gogogo();
    }
}
