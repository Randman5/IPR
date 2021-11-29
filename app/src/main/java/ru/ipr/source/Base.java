package ru.ipr.source;


import ru.ipr.di.components.DaggerMainComponent;
import ru.ipr.di.components.MainComponent;

public class Base {

    private MainComponent mainComponent;

    public Base() {

        mainComponent = DaggerMainComponent.builder().build();

    }

    public MainComponent getDaggerMainComponent() {
        return mainComponent;
    }
}
