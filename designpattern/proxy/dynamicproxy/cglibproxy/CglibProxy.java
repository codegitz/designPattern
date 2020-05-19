package com.imooc.netty.designpattern.proxy.dynamicproxy.cglibproxy;

import com.imooc.netty.designpattern.proxy.dynamicproxy.IUserDao;
import com.imooc.netty.designpattern.proxy.dynamicproxy.UserDaoImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: Cglib代理类，实现{@link MethodInterceptor#intercept(Object, Method, Object[], MethodProxy)}
 * @author: Codegitz
 * @create: 2020-05-18 12:54
 **/
public class CglibProxy implements MethodInterceptor {

    private Object targetObject;

    public Object getInstance(Object target){
        this.targetObject = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("start invoke...");
        Object invoke = method.invoke(targetObject, objects);
        System.out.println("finish invoke....");
        return invoke;
    }

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        IUserDao iUserDao = (IUserDao) cglibProxy.getInstance(new UserDaoImpl());
        System.out.println(iUserDao.getClass());
        iUserDao.save();
    }
}
