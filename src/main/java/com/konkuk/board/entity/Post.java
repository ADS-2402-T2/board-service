package com.konkuk.board.entity;

import com.konkuk.board.dto.PostDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String text;

    @Column(nullable = false)
    String title;


    public PostDto toDto(){

        return new PostDto(id, title, text, getCreatedDate());
    }
}
