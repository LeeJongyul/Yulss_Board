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
    @Comment("POST KEY")
    private Long postKey;

    //외래키
    @ManyToOne
    @JoinColumn(name="user_key")
    private User user;

    @Column(name="create_by")
    private Long createBy;

    @Column(name="modify_time")
    private LocalDateTime modifyTime;

    @Column(name="modify_by")
    private Long modifyBy;

    @Column(name="delete_time")
    private LocalDateTime deleteTime;

    @Column(name="delete_flag")
    private Long deleteFlag;

    @Column(name="post_title")
    private String postTitle;

    @Column(name="post_content")
    private String postContent;

    @Column(name="post_file")
    private String postFile;

    @Column(name="post_image")
    private String postImage;

    @Column(name="post_map")
    private String postMap;

    @Column(name="post_open")
    private String postOpen;

    @Column(name="create_time")
    private LocalDateTime createTime;



}
