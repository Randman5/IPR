package ru.ipr.app;

import ru.ipr.di.components.DaggerMainComponent;
import ru.ipr.di.components.MainComponent;
import ru.multithrading.ThreadTest;

import javax.inject.Inject;

public class Base {

    private MainComponent mainComponent;

    public Base getContext(){
        return this;
    }

    public Base() {

        mainComponent = DaggerMainComponent.builder().build();

    }

    public MainComponent getDaggerMainComponent() {
        return mainComponent;
    }
}
