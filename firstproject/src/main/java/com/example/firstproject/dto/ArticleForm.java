package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

// dto class - form으로 들어오는 값들 객체로 받을 수 있는 dto class
// spring 내에서 layer간에 데이터를 전달하는 데이터 객체
public class ArticleForm {

    private String title;  // form의 name과 일치
    private String content;  // form의 name과 일치

    // 변수에 값을 받는 생성자 메소드
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // 객체가 저장하고 있는 값을 출력하는 메소드
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {  // dto -> entity, return type은 entity class Article class
        return new Article(null, title, content);  // id는 autoincremented, new - entity 객체 생성

    }


}
