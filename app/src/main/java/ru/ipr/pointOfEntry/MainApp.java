package ru.ipr.pointOfEntry;

import org.w3c.dom.Text;
import ru.ipr.source.Base;
import ru.multithrading.Threader;
import ru.multithrading.implementation.ByteFileWorkerImpl;
import ru.multithrading.implementation.FileWorkerImpl;
import ru.multithrading.interfaces.FileWorker;
import ru.multithrading.subClasses.CallbleThread;

import javax.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;


public class MainApp extends Base {

    @Inject
    public Threader threader;
    @Inject
    public FileWorkerImpl fileWorkerImpl;
    @Inject
    public ByteFileWorkerImpl byteFileWorker;

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
            byteFileWorker.write(byteArrayOutputStream, text);


            String TextRes = byteFileWorker.read(text.getBytes());
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
