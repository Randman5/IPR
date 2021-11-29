package ru.multithrading.implementation;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import ru.multithrading.enums.FileStringRes;
import ru.multithrading.interfaces.FileWorker;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

/**
 * Класс для работы с файлами. реализация интерфейса FileWorker
 * @autor Бабаев Руслан
 * создан 29.11.2021
 */

public class FileWorkerImpl implements FileWorker {

    @Override
    public void write(@NotNull String path, @NotNull String text) {
        File file = new File(path);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {

            byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(buffer);
            StringBuilder strBuilder = new StringBuilder();
            strBuilder.append("writed: ");
            strBuilder.append(text);
            strBuilder.append(buffer.length);
            strBuilder.append(" bytes in ");
            strBuilder.append(file.getAbsolutePath());
            System.out.println(strBuilder.toString());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String read(@NotNull String path) {

        File file = new File(path);

        if (file.exists()) {
            try (FileInputStream fileInputStream = new FileInputStream(file.getAbsoluteFile())) {
                if (fileInputStream.available() == 0) {
                    return FileStringRes.FILE_EMPTY.getText();
                }
                byte buffer[] = new byte[fileInputStream.available()];
                fileInputStream.read(buffer,0,fileInputStream.available());

                StringBuilder builder = new StringBuilder();
                for (byte ch: buffer) {
                    builder.append((char)ch);
                }

                return builder.toString();
            } catch (FileNotFoundException ex) {
                return FileStringRes.FILE_NOT_FOUND.getText();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return FileStringRes.FILE_NOT_FOUND.getText();
    }
}
