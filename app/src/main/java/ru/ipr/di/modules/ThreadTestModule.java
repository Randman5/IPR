package ru.ipr.di.modules;

import dagger.Module;
import dagger.Provides;
import ru.multithrading.ThreadTest;

import javax.inject.Singleton;

@Module
public class ThreadTestModule {

    @Singleton
    @Provides
    ThreadTest threadTest(){
        return new ThreadTest();
    }

}
