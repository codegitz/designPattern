package com.imooc.netty.designpattern.singleton;

import com.imooc.netty.test.thread.A;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestLazy {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Lazy> list = new ArrayList<Lazy>();
        FutureTask<ArrayList<Lazy>> futureTask = new FutureTask<ArrayList<Lazy>>(new LazyCallable(list));
        for (int i = 0 ; i < 1000 ; i++){
            Thread t = new Thread(futureTask, "name" + i);
            t.start();
            System.out.println(t.toString());
        }
        if (!futureTask.isDone()){
            System.out.println("tasks not finished...");
        }
        ArrayList<Lazy> lalist = futureTask.get();
        for (Lazy la:lalist
             ) {
            System.out.println(la.toString());
        }

    }

}