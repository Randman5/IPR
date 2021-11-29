package ru.multithrading;

import javax.inject.Inject;

public class Threader extends ThreaderBase{

    @Inject
    public ThreadTest threadTest;

    public Threader() {
        super();
        super.getThreaderComponent().inject(this);

    }
}
