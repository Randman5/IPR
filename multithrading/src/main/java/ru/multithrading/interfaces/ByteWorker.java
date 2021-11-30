package ru.multithrading.interfaces;


import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Интерфейс для работы с файлами
 * @autor Бабаев Руслан
 * создан 30.11.2021
 */

public interface ByteFileWorker {
    /**
     * Функция записывает текст в ByteArrayOutputStream
     * @param byteArrayOutputStream пото
     * @param text текст который будет записан
     */
    void write(@NotNull ByteArrayOutputStream byteArrayOutputStream, @NotNull String text);

    /**
     * Функция считывает текст из файл по указанному пути
     * @param bytes поток откуда будет производится чтение
     * @return возвращает название производителя
     */
    String read(byte[] bytes);
}
