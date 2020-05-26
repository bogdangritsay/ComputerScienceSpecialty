package com.mcsumdu.hritsay.specialty.controllers;

import com.mcsumdu.hritsay.specialty.dao.EducatorsPostgresDAO;
import com.mcsumdu.hritsay.specialty.dao.NewsPostgresDAO;
import com.mcsumdu.hritsay.specialty.models.Educator;
import com.mcsumdu.hritsay.specialty.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class MainController {
    @Autowired
    private NewsPostgresDAO newsPostgresDAO;
    @Autowired
    private EducatorsPostgresDAO educatorsPostgresDAO;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<News> news = newsPostgresDAO.getThreeLastNews();
        model.addAttribute("news", news);
        return "home";
    }

    @GetMapping("/teachers")
    public String showAllTeachers(Model model) {
        List<Educator> educators = educatorsPostgresDAO.getAllEducators();
        model.addAttribute("teachers", educators);
        return "teachers";
    }

}
