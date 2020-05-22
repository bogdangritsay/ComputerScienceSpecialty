package com.mcsumdu.hritsay.specialty.controllers;


import com.mcsumdu.hritsay.specialty.models.News;
import com.mcsumdu.hritsay.specialty.repo.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/")
    public String home(Model model) {

        Iterable<News> sourceNews = newsRepository.findAll();
        List<News> newsList = new ArrayList<>();
        int count = 0;
        Iterator newsIterator = sourceNews.iterator();
        while(newsIterator.hasNext()) {
            if(count == 3) break;
            newsList.add((News)newsIterator.next());

            count++;
        }
        Iterable<News> news = newsList;
        model.addAttribute("news", news);
        return "home";
    }

}
