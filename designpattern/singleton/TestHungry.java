package com.imooc.netty.designpattern.singleton;

public class TestHungry {

    public static void main(String[] args) {
        Hungry l1 = Hungry.getInstance();
        Hungry l2 = Hungry.getInstance();
        System.out.println(l1 == l2);
    }
}
