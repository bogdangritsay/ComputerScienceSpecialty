package com.mcsumdu.hritsay.specialty.dao;

import com.mcsumdu.hritsay.specialty.models.News;

import java.util.ArrayList;
import java.util.List;

public class NewsPostgresDao extends PostgresDAOConnection {

    public List<News> getAllNews() {

        List<News> news = new ArrayList<>();

        return news;
    }
}
