package com.m.roman.oreh.repository;

import com.m.roman.oreh.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}