package ru.boris.chat.chatservice.dto;

import ru.boris.chat.chatservice.enums.MessageType;
import ru.boris.chat.chatservice.exception.ValidationException;

import java.time.Instant;

public record MessageDto(
    Long id,
    Long groupId, // Даже для чата двух людей, т.к. это группа.
    Long senderId, // Кто отправил сообщение.
    String content,
    MessageType type,
    Instant createdAt,
    Instant updatedAt) {

    public MessageDto {
        if (content == null || content.isBlank()) { throw new ValidationException("content is required");}
        if (type == null) { throw new ValidationException("type is required");}
        if (groupId == null) { throw new ValidationException("groupId is required");}
        if (senderId == null) { throw new ValidationException("senderId is required");}
    }
}