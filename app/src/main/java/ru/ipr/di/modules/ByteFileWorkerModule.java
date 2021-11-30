package ru.ipr.di.modules;

import dagger.Module;
import dagger.Provides;
import ru.multithrading.implementation.ByteWorkerImpl;

import javax.inject.Singleton;

@Module
public class ByteFileWorkerModule {

    @Singleton
    @Provides
    ByteWorkerImpl byteFileWorker() {
        return new ByteWorkerImpl();
    }

}
