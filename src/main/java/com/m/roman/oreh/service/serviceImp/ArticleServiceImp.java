package com.m.roman.oreh.service.serviceImp;

import com.roman.portier.entity.Article;
import com.roman.portier.repository.ArticleRepository;
import com.roman.portier.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImp implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImp(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Article getArticle(int id) {
        return articleRepository.findById(id).get();
    }
}
