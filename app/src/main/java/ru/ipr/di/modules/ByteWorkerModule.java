package ru.ipr.di.modules;

import dagger.Module;
import dagger.Provides;
import ru.multithrading.implementation.FileWorkerImpl;

import javax.inject.Singleton;


@Module
public class ByteWorkerModule {

    @Singleton
    @Provides
    public FileWorkerImpl fileWorkerImpl(){
        return new FileWorkerImpl();
    }
}
