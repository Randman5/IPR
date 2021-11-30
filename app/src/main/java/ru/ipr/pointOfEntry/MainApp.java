package ru.ipr.pointOfEntry;

import ru.ipr.source.Base;
import ru.multithrading.Threader;
import ru.multithrading.implementation.ByteWorkerImpl;
import ru.multithrading.implementation.FileWorkerImpl;
import ru.multithrading.subClasses.CallbleThread;

import javax.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.util.HashMap;


public class MainApp extends Base {

    @Inject
    public Threader threader;
    @Inject
    public FileWorkerImpl fileWorkerImpl;
    @Inject
    public ByteWorkerImpl byteWorker;

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

            String text = "hello World!!!";

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteWorker.write(byteArrayOutputStream, text);

            HashMap<String, Integer> map = new HashMap<>();


            String TextRes = byteWorker.read(text.getBytes());
            System.out.println(TextRes);

            return null;
        });

//        new CallbleThread<Void>().startWith(() -> {
//            fileWorkerImpl.write("HelloWorld.txt","Привет мир !!!");
//            return null;
//        });
//
//        new CallbleThread<Void>().startWith(() -> {
//            System.out.println(fileWorkerImpl.read("HelloWorld.txt"));
//            return null;
//        });

    }
}
