package com.m.roman.oreh.service.serviceImp;

import com.m.roman.oreh.entity.News;
import com.m.roman.oreh.repository.NewsRepository;
import com.m.roman.oreh.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewsServiceImp implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImp(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }
    @Override
    public News getNews(int id) {
        Optional<News> news = newsRepository.findById(id);
        return news.orElse(null);
    }
}
