package ru.ipr.pointOfEntry;

import ru.ipr.source.Base;
import ru.multithrading.Threader;
import ru.multithrading.implementation.FileWorkerImpl;
import ru.multithrading.interfaces.FileWorker;
import ru.multithrading.subClasses.CallbleThread;

import javax.inject.Inject;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;


public class MainApp extends Base {

    @Inject
    public Threader threader;
    @Inject
    public FileWorkerImpl fileWorkerImpl;

    public void display() {
        System.out.println("Main injected");
    }

    public MainApp() {
        super();
        super.getDaggerMainComponent().inject(this);
        exec();
    }

    private void exec() {

        try {
            threader.callbleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        new CallbleThread<Void>().startWith(() -> {
            fileWorkerImpl.write("HelloWorld.txt","Привет мир !!!");
            return null;
        });

        new CallbleThread<Void>().startWith(() -> {
            System.out.println(fileWorkerImpl.read("HelloWorld.txt"));
            return null;
        });

    }
}
