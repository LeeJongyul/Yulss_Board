package com.example.Yulss.entity;

import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Entity
@Table(name="temporary")
public class Temporary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="temp_key",nullable = false)
    @Comment("TEMP KEY")
    private Long tempKey;


    @ManyToOne
    @JoinColumn(name ="user_key",nullable = false)
    private Long userKey;

    @ManyToOne
    @JoinColumn(name ="post_key",nullable = false)
    private Long postKey;

    @ManyToOne
    @JoinColumn(name="post_title",nullable = false)
    private String postTitle;

    @ManyToOne
    @JoinColumn(name="post_content",nullable = false)
    private String postContent;





}
