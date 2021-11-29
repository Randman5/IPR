package ru.multithrading.di.modules;

import dagger.Module;
import dagger.Provides;
import jdk.jfr.Name;
import ru.multithrading.ThreadTest;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class ThreadTestModule {

    @Singleton
    @Provides
    public ThreadTest threadTest() {
        return new ThreadTest();
    }
}
