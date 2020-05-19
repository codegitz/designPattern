package com.imooc.netty.designpattern.proxy.staticproxy;

/**
 * @description: IUserDao实现类
 * @author: Codegitz
 * @create: 2020-05-18 12:05
 **/
public class UserDaoImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("UserDaoImpl.save execute ....");
    }
}
