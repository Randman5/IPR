package ru.multithrading.interfaces;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

/**
 * Интерфейс для работы с файлами
 * @autor Бабаев Руслан
 * создан 29.11.2021
 */

public interface FileWorker {

    /**
     * Функция записывает текст в файл по указанному пути
     * @param path путь до файла
     * @param text текст который будет записан
     * @return возвращает название производителя
     */
    void write(@NotNull String path, @NotNull String text);

    /**
     * Функция считывает текст из файл по указанному пути
     * @param path путь до файла
     * @return возвращает название производителя
     */
    String read(@NotNull String path);
}
