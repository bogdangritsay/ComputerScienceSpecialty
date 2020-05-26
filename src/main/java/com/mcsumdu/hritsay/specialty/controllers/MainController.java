package com.mcsumdu.hritsay.specialty.controllers;

import com.mcsumdu.hritsay.specialty.dao.EducatorsPostgresDAO;
import com.mcsumdu.hritsay.specialty.dao.NewsPostgresDAO;
import com.mcsumdu.hritsay.specialty.dao.StudentsPostgresDAO;
import com.mcsumdu.hritsay.specialty.models.Educator;
import com.mcsumdu.hritsay.specialty.models.Group;
import com.mcsumdu.hritsay.specialty.models.News;
import com.mcsumdu.hritsay.specialty.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {
    @Autowired
    private NewsPostgresDAO newsPostgresDAO;
    @Autowired
    private EducatorsPostgresDAO educatorsPostgresDAO;
    @Autowired
    private StudentsPostgresDAO studentsPostgresDAO;

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

    @GetMapping("/students")
    public String showStudents(Model model) {
        List<Group> groups = studentsPostgresDAO.getAllGroups();
        model.addAttribute("groups", groups);
        return "students";
    }

    @PostMapping("/students")
    public String showStudentsByGroup(@RequestParam String groupTitle, Model model) {
        List<Group> groups = studentsPostgresDAO.getAllGroups();
        model.addAttribute("groups", groups);
        Group group = studentsPostgresDAO.getGroupByTitle(groupTitle);
        List<Student> students = studentsPostgresDAO.getAllStudentsByGroup(group);
        model.addAttribute("students", students);
        return "students";
    }

}
