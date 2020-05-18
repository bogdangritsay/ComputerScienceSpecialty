package com.mcsumdu.hritsay.specialty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/groups")
public class StudentGroupsController {

    @GetMapping("/allgroups")
    public String showAllGroups() {
        return "groups";
    }
}
