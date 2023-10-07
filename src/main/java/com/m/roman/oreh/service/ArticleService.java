package com.m.roman.oreh.service;


import com.m.roman.oreh.model.Article;

import java.util.List;

public interface ArticleService {

    public List<Article> getAllArticles();

    public Article getArticle(long id);

    public void addArticle(Article article);

    public void updateArticle(Article article);


    public void deleteArticle(long id);
}
