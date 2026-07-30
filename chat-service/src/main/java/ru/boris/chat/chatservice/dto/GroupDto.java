package ru.boris.chat.chatservice.dto;

import ru.boris.chat.chatservice.exception.ValidationException;

import java.time.Instant;

public record GroupDto(
    Long id, 
    String name, 
    Long ownerId, 
    Instant createdAt, 
    Instant updatedAt) {

    public GroupDto {
        if (name == null || name.isBlank()) { throw new ValidationException("name is required");}
        if (ownerId == null) { throw new ValidationException("ownerId is required");}
    }
}
