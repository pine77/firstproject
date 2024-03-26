package com.example.firstproject.repository;


import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
// CrudRepository를 통해서 database에 crud하는 기능을 상속
// CrudRepository는 jpa에서 제공하는 데이터베이스에 crud하는 함수를 포함한 interface.




}
