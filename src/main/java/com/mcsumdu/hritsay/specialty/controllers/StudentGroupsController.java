package com.mcsumdu.hritsay.specialty.controllers;

import com.mcsumdu.hritsay.specialty.dao.StudentMySQLDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/groups")
public class StudentGroupsController {
    @Autowired
    private StudentMySQLDAO studentMySQLDAO;


    @GetMapping("/allgroups")
    public String showAllGroups() {
        studentMySQLDAO.getAllStudentsByGroup("dfg");
        return "groups";
    }
}
