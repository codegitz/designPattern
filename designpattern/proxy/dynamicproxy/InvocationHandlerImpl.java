package com.imooc.netty.designpattern.proxy.dynamicproxy;

import java.lang.reflect.*;

/**
 * @description: {@link InvocationHandler}实现类，每次生成动态代理类对象时，实现了InvocationHandler接口的调用处理器对象
 * @author: Codegitz
 * @create: 2020-05-18 12:28
 **/
public class InvocationHandlerImpl implements InvocationHandler {

    //这是业务实现类对象，用来调用具体的业务方法
    private Object target;

    //通过构造方法传入
    public InvocationHandlerImpl(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start invoke....");
        Object invoke = method.invoke(target, args);
        System.out.println("finish invoke....");
        return invoke;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //被代理的对象
        IUserDao iUserDao = new UserDaoImpl();
        InvocationHandlerImpl invocationHandler = new InvocationHandlerImpl(iUserDao);
        ClassLoader classLoader = iUserDao.getClass().getClassLoader();
        Class<?>[] interfaces = iUserDao.getClass().getInterfaces();
        Class<?> proxyClass = Proxy.getProxyClass(classLoader, interfaces);
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
        IUserDao iUserDao1 = (IUserDao) constructor.newInstance(invocationHandler);
        System.out.println(iUserDao1.getClass());
        iUserDao1.save();
        System.out.println("====================");
        //主要装载器、一组接口及调用处理动态代理实例
        IUserDao newProxyInstance = (IUserDao) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        System.out.println(newProxyInstance.getClass());
        newProxyInstance.save();
    }
}
