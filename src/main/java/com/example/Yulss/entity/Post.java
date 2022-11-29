package com.example.Yulss.entity;

import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_key", nullable = false)
    @Comment("USER KEY")
    private Long postKey;

    //외래키
    @ManyToOne
    @JoinColumn(name="user_key")
    private User user;


    @Column(name="create_time")
    private LocalDateTime createTime;

}
