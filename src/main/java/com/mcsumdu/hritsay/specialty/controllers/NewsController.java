package com.mcsumdu.hritsay.specialty.controllers;

import com.mcsumdu.hritsay.specialty.dao.DAOConnection;
import com.mcsumdu.hritsay.specialty.dao.NewsPostgresDAO;
import com.mcsumdu.hritsay.specialty.dao.PostgresDAOConnection;
import com.mcsumdu.hritsay.specialty.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class NewsController {
    @Autowired
    NewsPostgresDAO connection;




    @GetMapping("/news")
    public String newsMain(Model model) {


        Iterable<News> news = connection.getAllNews();
        model.addAttribute("news", news);
        return "news";
    }

    @GetMapping("/news/{id}")
    public String newsDetails(@PathVariable(value = "id") long id, Model model) {
       /*if(!newsRepository.existsById(id)) {
            return "redirect:/news";
        }*/
        Optional<News> news = connection.
        ArrayList<News> res = new ArrayList<>();
        news.ifPresent(res::add);
        model.addAttribute("news", res);*/


        return "news-details";
    }



}
