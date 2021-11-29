package ru.multithrading.subClasses;


import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import java.util.concurrent.Callable;

public class CallbleThread<T> extends Thread{

    private Callable<T> fun;

    public void startWith(@NotNull Callable<T> fun){
        this.fun = fun;
        this.start();
    }


    @Override
    public void run() {
        super.run();
        try {
            fun.call();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
