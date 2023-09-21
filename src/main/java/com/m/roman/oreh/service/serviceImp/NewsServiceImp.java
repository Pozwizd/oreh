package com.m.roman.oreh.service.serviceImp;

import com.m.roman.oreh.entity.News;
import com.m.roman.oreh.repository.NewsRepository;
import com.m.roman.oreh.service.NewsService;

public class NewsServiceImp implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImp(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }
    @Override
    public News getNews(int id) {
        return newsRepository.findById(id).get();
    }
}
