package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// entity
// 데이터베이스에 입축력 되는 데이터객체
// dto가 데이터베이스로 입축력 되려면 entity로 변경괴어야 가능...
// entity 구조에 맞춰서 jpa는 데이터베이스에 table 생성 - 테이블 이름은 클래스 이름..
@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;   // 테이블 칼럼 - primary key, autoincremented
    @Column
    private String title;  // title 칼럼
    @Column
    private String content;  // content 칼럼

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
