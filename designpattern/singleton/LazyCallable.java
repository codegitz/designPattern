package com.imooc.netty.designpattern.singleton;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class LazyCallable implements Callable<ArrayList<Lazy>> {

    public ArrayList<Lazy> list;

    public LazyCallable(ArrayList<Lazy> list){
        this.list = list;
    }

    @Override
    public ArrayList<Lazy> call() throws Exception {
        list = new ArrayList<Lazy>();
        list.add(Lazy.getInstance());
        return list;
    }
}
