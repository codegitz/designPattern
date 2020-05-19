package com.imooc.netty.designpattern.proxy.staticproxy;

/**
 * @description: 代理类
 * @author: Codegitz
 * @create: 2020-05-18 12:06
 **/
public class UserDaoProxy implements IUserDao {
    private IUserDao target;

    public UserDaoProxy(IUserDao target){
        this.target = target;
    }
    @Override
    public void save() {
        System.out.println("UserDaoProxy.save execute before IUserDao.save....");
        //通过在调用实现类之前，代理类先执行一些处理，可以实现静态代理，此部分为写死功能，不好修改
        target.save();
        //同理，执行后续操作
        System.out.println("UserDaoProxy.save execute after IUserDao.save....");
    }

    public static void main(String[] args) {
        IUserDao iUserDao = new UserDaoImpl();
        UserDaoProxy userDaoProxy = new UserDaoProxy(iUserDao);
        //测试
        userDaoProxy.save();
    }
}
