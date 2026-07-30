package ru.boris.chat.chatservice.dto;

import ru.boris.chat.chatservice.exception.ValidationException;

public record UserDto(
    Long id,
    String username, 
    String email)
{
    public UserDto {
        if (username == null || username.isBlank()) throw new ValidationException("username не может быть null");
    }
}
