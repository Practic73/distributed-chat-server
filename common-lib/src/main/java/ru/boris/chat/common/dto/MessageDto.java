package ru.boris.chat.common.dto;

import java.time.Instant;

import ru.boris.chat.common.enums.MessageType;

public record MessageDto(
    Long id,
    Long groupId, // Даже для чата двух людей, т.к. это группа.
    Long senderId, // Кто отправил сообщение.
    String content,
    MessageType type,
    Instant createdAt,
    Instant updatedAt) {
}