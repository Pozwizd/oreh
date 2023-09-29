package com.m.roman.oreh.service.serviceImp;


import com.m.roman.oreh.entity.Article;
import com.m.roman.oreh.repository.ArticleRepository;
import com.m.roman.oreh.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImp implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImp(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Article getArticle(int id) {
        Optional<Article> article = articleRepository.findById(id);
        return article.orElse(null);
    }

    @Override
    public void addArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void deleteArticle(int id) {
        articleRepository.deleteById(id);
    }
}
