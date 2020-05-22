package com.mcsumdu.hritsay.specialty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teachers")
public class TeachersController {


    public String showAllTeachers() {
        return "teachers";
    }
}
