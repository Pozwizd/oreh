package com.m.roman.oreh.service;


import com.m.roman.oreh.entity.Article;

import java.util.List;

public interface ArticleService {

    public List<Article> getAllArticles();

    public Article getArticle(int id);

    public void addArticle(Article article);

    public void updateArticle(Article article);


    public void deleteArticle(int id);
}
