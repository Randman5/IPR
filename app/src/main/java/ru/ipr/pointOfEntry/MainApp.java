package ru.ipr.pointOfEntry;

import ru.ipr.source.Base;
import ru.multithrading.ThreadTest;
import ru.multithrading.Threader;

import javax.inject.Inject;

public class MainApp extends Base {

    @Inject
    public Threader threader;

    public void display() {
        System.out.println("Main injected");
    }

    public MainApp() {
        super();
        super.getDaggerMainComponent().inject(this);
        exec();
    }

    private void exec(){
        threader.threadTest.start();
    }
}
