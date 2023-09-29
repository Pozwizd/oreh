package com.m.roman.oreh.repository;

import com.m.roman.oreh.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}