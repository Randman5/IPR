package ru.ipr.di.components;

import dagger.Component;
import ru.ipr.di.modules.ThreaderModule;
import ru.ipr.pointOfEntry.MainApp;

import javax.inject.Singleton;


@Singleton
@Component(modules = {ThreaderModule.class})
public interface MainComponent {

    void inject(MainApp mainApp);

}
