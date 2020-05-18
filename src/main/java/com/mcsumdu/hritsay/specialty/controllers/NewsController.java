package com.mcsumdu.hritsay.specialty.controllers;

import com.mcsumdu.hritsay.specialty.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class NewsController {
    @GetMapping("/news")
    public String newsMain(Model model) {
        /*Iterable<News> news = newsRepository.findAll();
        model.addAttribute("news", news);*/
        return "news";
    }

    @GetMapping("/news/{id}")
    public String newsDetails(@PathVariable(value = "id") long id, Model model) {
       /*if(!newsRepository.existsById(id)) {
            return "redirect:/news";
        }
        Optional<News> news = newsRepository.findById(id);
        ArrayList<News> res = new ArrayList<>();
        news.ifPresent(res::add);
        model.addAttribute("news", res);*/
        return "news-details";
    }



}
