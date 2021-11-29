package ru.multithrading.di.components;

import dagger.Component;
import ru.multithrading.Threader;
import ru.multithrading.ThreaderBase;
import ru.multithrading.di.modules.ThreadTestModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ThreadTestModule.class})
public interface ThreaderComponent {

    void inject(Threader threader);

}
