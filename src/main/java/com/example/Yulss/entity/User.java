package com.example.Yulss.entity;

import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_key", nullable = false)
    @Comment("USER KEY")
    private Long userKey;

    @Column(name="user_id", nullable = false)
    private String userId;

    @Column(name = "user_pw", nullable = false)
    private String userPw;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_address")
    private String userAddress;

    @Column(name = "user_profile")
    private String userProfile;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_introduce")
    private String userIntroduce;

    @Column(name="create_time")
    private LocalDateTime createTime;

    @Column(name ="create_by")
    private Long createBy;

    @Column(name="modify_time")
    private LocalDateTime modifyTime;

    @Column(name ="modify_by")
    private Long modifyBy;

    @Column(name = "delete_time")
    private LocalDateTime deleteTime;

    @Column(name = "delete_flag")  //??? default 0???
    private Long deleteFlag;

    /*
       1) entity 작성
       2) 개발자 면접 질문
       3) 프로그래머스 Sql문제 풀기
       4) @Id, @GeneratedValue

       개인공부
       코드업 문제 풀기
       entity, repository 개념 공부하기
       JPA 다시 공부

     */
}
