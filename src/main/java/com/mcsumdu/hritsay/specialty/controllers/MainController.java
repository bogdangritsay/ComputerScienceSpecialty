package com.mcsumdu.hritsay.specialty.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {

      /*  Iterable<News> sourceNews = newsRepository.findAll();
        List<News> newsList = new ArrayList<>();
        int count = 0;
        Iterator newsIterator = sourceNews.iterator();
        while(newsIterator.hasNext()) {
            if(count == 3) break;
            newsList.add((News)newsIterator.next());

            count++;
        }
        Iterable<News> news = newsList;
        model.addAttribute("news", news);*/
        return "home";
    }

}
