package com.imooc.netty.designpattern.prototype;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book();
        book1.setTitle("book1");
        book1.add("name1");
        //先展示一下book1
        book1.showBook();

        //克隆book1的属性给book2
        Book book2 = (Book)book1.clone();
        book2.setTitle("book2");
        //给book2增加属性
        book2.add("name2");
        //展示book2
        book2.showBook();
        //再展示book1
        book1.showBook();
    }
}
