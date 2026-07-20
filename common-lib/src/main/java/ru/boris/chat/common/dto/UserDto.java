package ru.boris.chat.common.dto;

public record UserDto(
    Long id,
    String username, 
    String email) {
}
