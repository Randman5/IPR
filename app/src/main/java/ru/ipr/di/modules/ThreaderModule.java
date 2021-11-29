package ru.ipr.di.modules;

import dagger.Module;
import dagger.Provides;
import ru.multithrading.Threader;
import javax.inject.Singleton;

@Module
public class ThreaderModule {

    @Singleton
    @Provides
    public Threader threader(){
        return new Threader();
    }

}
