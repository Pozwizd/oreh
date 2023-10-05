package com.m.roman.oreh.service.serviceImp;

import com.m.roman.oreh.entity.News;
import com.m.roman.oreh.repository.NewsRepository;
import com.m.roman.oreh.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImp implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImp(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public News getNews(long id) {
        Optional<News> news = newsRepository.findById(id);
        return news.orElse(null);
    }

    @Override
    public void saveNews(News news) {
        newsRepository.save(news);
    }

    @Override
    public void deleteNews(long id) {
        newsRepository.deleteById(id);
    }

    @Override
    public void updateNews(News news) {
        newsRepository.save(news);
    }
}
