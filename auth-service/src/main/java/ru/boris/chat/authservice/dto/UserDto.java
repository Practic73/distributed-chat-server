package ru.boris.chat.authservice.dto;

import ru.boris.chat.authservice.exception.ValidationException;

public record UserDto(
    Long id,
    String username,
    String email)
{
    public UserDto {
        if (username == null || username.isBlank()) { throw new ValidationException("username is required");
        }
    }
}
