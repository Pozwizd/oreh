package com.m.roman.oreh.service;

import com.m.roman.oreh.entity.News;

import java.util.List;

public interface NewsService {

    public List<News> getAllNews();

    public News getNews(int id);

    public void saveNews(News news);

    public void deleteNews(int id);

    public void updateNews(News news);
}
