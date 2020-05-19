package com.imooc.netty.designpattern.prototype;

import java.util.ArrayList;


/**
 * @description: 原型类
 * @author: Codegitz
 * @create: 2020-05-19 13:43
 **/
public class Book extends Object implements Cloneable {

    private String title;

    private ArrayList<String> imgList = new ArrayList<>();

    public Book(){
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getImgList() {
        return imgList;
    }

    public void setImgList(ArrayList<String> imgList) {
        this.imgList = imgList;
    }

    public void add(String name){
        imgList.add(name);
    }

    /**
     * 重写拷贝方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Book clone() throws CloneNotSupportedException {

        try{
            Book book = (Book) super.clone();
            //深拷贝，开辟新的内存
            book.imgList = (ArrayList<String>) this.imgList.clone();
            return book;
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }


    public void showBook(){
        System.out.println("=============start=================");
        System.out.println("title: "+title);
        for (String img : imgList){
            System.out.println("img: "+img);
        }
        System.out.println("==============end=================");
    }
}
