package ru.boris.chat.chatservice.dto;

public record UserDto(
    Long id,
    String username, 
    String email) {
}
