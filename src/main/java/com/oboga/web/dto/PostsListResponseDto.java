package com.oboga.web.dto;

import java.time.LocalDateTime;

import com.oboga.domain.posts.Posts;

import lombok.Getter;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime mod_Date;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.mod_Date = entity.getMod_Date();
    }
}
