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
public enum FileStringRes {
    FILE_NOT_FOUND("Файл не найден."),
    FILE_EMPTY("Файл пуст.");

    private String text;
}