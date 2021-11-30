package ru.multithrading.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Ресурс строк для работы с потоками
 * @autor Бабаев Руслан
 * создан 29.11.2021
 */

@AllArgsConstructor
@Getter
public enum StreamStringRes {
    STREAM_EMPTY("Поток пуст.");

    private String text;
}