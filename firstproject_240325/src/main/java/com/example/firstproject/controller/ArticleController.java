package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class ArticleController {

    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form, Model model) {  // form에서 날아오 값을 dto로 받는다

        // dto로 받은 값 출력...
        System.out.println(form.toString());  // 받은 dto에 저장된 값을 출력..

        // dto 객체에 저장되 값을 데이터베이스에 저장하려면 다시 entity로 변한
        // 1. dto를 enetity로 변환
        Article article = form.toEntity();
        System.out.println(article.toString());  // 전환된 entity 객체의 값을 확인

        // 2. repository class를 통해서 database에 entity를 crud
        // Article saved = articleRepository.save(article);

        // 임시 view
        model.addAttribute("username", "Spring");
        return "greetings";
    }

}

