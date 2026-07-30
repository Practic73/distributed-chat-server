package ru.boris.chat.authservice.dto;

public record UserDto(
    Long id,
    String username, 
    String email) {
}
