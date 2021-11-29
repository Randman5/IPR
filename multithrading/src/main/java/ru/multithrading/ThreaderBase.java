package ru.multithrading;

import ru.multithrading.di.components.DaggerThreaderComponent;
import ru.multithrading.di.components.ThreaderComponent;

public class ThreaderBase {

    private ThreaderComponent threaderComponent;

    ThreaderBase(){

        this.threaderComponent = DaggerThreaderComponent.builder().build();

    }

    public ThreaderComponent getThreaderComponent(){
        return this.threaderComponent;
    }
}
