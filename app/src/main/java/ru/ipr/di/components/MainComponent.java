package ru.ipr.di.components;

import dagger.Component;
import ru.ipr.di.modules.ByteFileWorkerModule;
import ru.ipr.di.modules.FileWorkerModule;
import ru.ipr.di.modules.ThreaderModule;
import ru.ipr.pointOfEntry.MainApp;

import javax.inject.Singleton;


@Singleton
@Component(modules = {ThreaderModule.class, FileWorkerModule.class, ByteFileWorkerModule.class})
public interface MainComponent {

    void inject(MainApp mainApp);

}
