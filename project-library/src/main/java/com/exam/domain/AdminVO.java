package com.exam.domain;

import java.sql.Timestamp;

import lombok.Data;
@Data
public class AdminVO { /* 공지사항 게시판 VO 임. 명칭이 이럴뿐. */
    private int num;         // 글번호
    private String name;     // 작성자명
    private String pass;     // 글 비밀번호
    private String subject;  // 글제목
    private String content;  // 글내용
    private String filename; // 업로드한 파일명
    private int reRef;      // 글그룹 번호
    private int reLev;      // 글 들여쓰기(답글) 레벨
    private int reSeq;      // 글그룹 내에서의 순서
    private int readcount;   // 조회수
    private Timestamp regDate;  // 글 작성(등록) 날짜시간
    private String ip;       // 작성자 IP주소
}
