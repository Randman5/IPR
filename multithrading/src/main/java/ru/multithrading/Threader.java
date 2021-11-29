package ru.multithrading;

import ru.multithrading.subClasses.CallbleThread;

import javax.inject.Inject;

public class Threader extends ThreaderBase{

    @Inject
    public CallbleThread callbleThread;

    public Threader() {
        super();
        super.getThreaderComponent().inject(this);
    }
}
