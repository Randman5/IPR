package ru.multithrading.di.modules;

import dagger.Module;
import dagger.Provides;
import ru.multithrading.subClasses.CallbleThread;

import javax.inject.Singleton;

@Module
public class ThreadTestModule {

    @Singleton
    @Provides
    public CallbleThread threadTest() {
        return new CallbleThread();
    }
}
