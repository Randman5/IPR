package ru.ipr.di.components;

import dagger.Component;
import ru.ipr.app.Base;
import ru.ipr.di.modules.ThreadTestModule;
import ru.ipr.source.MainApp;

import javax.inject.Singleton;


@Singleton
@Component(modules = {ThreadTestModule.class})
public interface MainComponent {

    void inject(MainApp mainApp);

}
