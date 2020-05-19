package com.imooc.netty.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;

public class TestInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer one = new Integer(231);
        Integer two = new Integer(232);
        Integer three = new Integer(233);
        Integer four = 233;
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        three = 234;
        System.out.println(list);
    }
}
