package com.imooc.netty.designpattern.proxy.dynamicproxy;

/**
 * @description: 接口实现类
 * @author: Codegitz
 * @create: 2020-05-18 12:25
 **/
public class UserDaoImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("UserDaoImpl.save execute....");
    }
}
