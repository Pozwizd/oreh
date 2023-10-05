package com.m.roman.oreh.service;

import com.m.roman.oreh.entity.News;

import java.util.List;

public interface NewsService {

    public List<News> getAllNews();

    public News getNews(long id);

    public void saveNews(News news);

    public void deleteNews(long id);

    public void updateNews(News news);
}
