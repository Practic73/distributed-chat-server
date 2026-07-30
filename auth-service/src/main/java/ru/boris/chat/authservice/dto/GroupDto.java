package ru.boris.chat.authservice.dto;

import java.time.Instant;

public record GroupDto(
    Long id, 
    String name, 
    Long ownerId, 
    Instant createdAt, 
    Instant updatedAt) {
}
