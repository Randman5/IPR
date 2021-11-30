package ru.ipr.di.modules;

import dagger.Module;
import dagger.Provides;
import ru.multithrading.implementation.ByteFileWorkerImpl;

import javax.inject.Singleton;

@Module
public class ByteFileWorkerModule {

    @Singleton
    @Provides
    ByteFileWorkerImpl byteFileWorker() {
        return new ByteFileWorkerImpl();
    }

}
