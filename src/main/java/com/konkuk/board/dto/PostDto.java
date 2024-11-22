package com.konkuk.board.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostDto {

    Long id;
    String title;
    String text;
    LocalDateTime createdDateTime;

    public PostDto(Long id, String title, String text, LocalDateTime createdDateTime) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.createdDateTime = createdDateTime;
    }
}
