package com.m.roman.oreh.service.serviceImp;


import com.m.roman.oreh.entity.Article;
import com.m.roman.oreh.repository.ArticleRepository;
import com.m.roman.oreh.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleServiceImp implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImp(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Article getArticle(int id) {
        Optional<Article> article = articleRepository.findById(id);
        return article.orElse(null);
    }
}
