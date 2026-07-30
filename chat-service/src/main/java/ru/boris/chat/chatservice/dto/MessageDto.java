package ru.boris.chat.chatservice.dto;

import ru.boris.chat.common.enums.MessageType;

import java.time.Instant;

public record MessageDto(
    Long id,
    Long groupId, // Даже для чата двух людей, т.к. это группа.
    Long senderId, // Кто отправил сообщение.
    String content,
    MessageType type,
    Instant createdAt,
    Instant updatedAt) {
}