package ru.ipr.source;

import ru.ipr.app.Base;
import ru.multithrading.ThreadTest;

import javax.inject.Inject;

public class MainApp extends Base {

    @Inject
    public ThreadTest threadTest;

    public MainApp() {
        super();
        ((Base)super.getContext()).getDaggerMainComponent().inject(this);

        threadTest.start();

    }

    public void display() {
        System.out.println("Main injected");
    }
}
