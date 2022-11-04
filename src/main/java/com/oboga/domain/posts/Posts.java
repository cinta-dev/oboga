package com.oboga.domain.posts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.oboga.domain.BaseTimeEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@SequenceGenerator(
		  name = "Post_SEQ_GENERATOR", 
		  sequenceName = "post_SEQ", // 매핑할 데이터베이스 시퀀스 이름 
		  initialValue = 1,
		  allocationSize = 1)
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    				generator = "Post_SEQ_GENERATOR")
    private Long id;
    
    @Column(length = 100, nullable = false)
    private String author;

    @Column(length = 4000, nullable = false)
    private String content;
    
    @Column(length = 100, nullable = false)
    private String title;  

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
