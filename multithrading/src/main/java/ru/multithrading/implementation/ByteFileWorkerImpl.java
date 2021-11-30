package ru.multithrading.implementation;

import ru.multithrading.enums.ByteFileStringRes;
import ru.multithrading.enums.FileStringRes;
import ru.multithrading.interfaces.ByteFileWorker;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Класс для работы с байтовыми потоками
 * @autor Бабаев Руслан
 * создан 30.11.2021
 */

public class ByteFileWorkerImpl implements ByteFileWorker {


    @Override
    public void write(ByteArrayOutputStream byteArrayOutputStream, String text) {
        byte[] buffer = text.getBytes();
        try{
            byteArrayOutputStream.write(buffer);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
            return;
        }
        System.out.println(byteArrayOutputStream.toString());
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("writed: ");
        strBuilder.append(byteArrayOutputStream.toString());
        strBuilder.append(buffer.length);
        strBuilder.append(" bytes in ");
        System.out.println(strBuilder.toString());
    }

    @Override
    public String read(byte[] bytes) {

        ByteArrayInputStream byteStream = new ByteArrayInputStream(bytes);
        StringBuilder stringBuilder = new StringBuilder();
        int val;
        while((val=byteStream.read())!=-1){
            stringBuilder.append((char)val);
        }
        String result = stringBuilder.toString();
        if (result.equals("")) {
            return ByteFileStringRes.STREAM_EMPTY.getText();
        }
        return result;
    }
}
