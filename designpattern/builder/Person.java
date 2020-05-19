package com.imooc.netty.designpattern.builder;

/**
 * @description: 假设这是一个复杂的对象，由各个部分组成
 * @author: Codegitz
 * @create: 2020-05-18 15:28
 **/
public class Person {
    private String head;
    private String body;
    private String foot;

    @Override
    public String toString() {
        return "Person{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", foot='" + foot + '\'' +
                '}';
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }
}
