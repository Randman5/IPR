package ru.multithrading.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Ресурс строк для работы с файлами
 * @autor Бабаев Руслан
 * создан 29.11.2021
 */

@AllArgsConstructor
@Getter
public enum ByteFileStringRes {
    STREAM_EMPTY("Поток пуст.");

    private String text;
}