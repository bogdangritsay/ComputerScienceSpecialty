package com.mcsumdu.hritsay.specialty.dao;


import com.mcsumdu.hritsay.specialty.models.Student;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMySQLDAO extends  MySQLDAOConnection {


    public List<Student> getAllStudentsByGroup(String group) {
        List<Student> students = new ArrayList<>();
        connect();
        try {
            statement = connection.prepareStatement(
                    "SELECT s.id, s.surname, s.name, s.middle_name, g.name  as GROUP_NAME FROM student s, `group` g WHERE s.group = g.id"
            );
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                students.add(parseStudent(resultSet));
            }
        } catch (SQLException e) {
            /* LOGS*/
        } finally {
            disconnect();
        }
        System.out.println(students);
        return students;
    }


    private Student parseStudent(ResultSet resultSet) {
        Student student = null;
        try {
            int id = resultSet.getInt("ID");
            String surname = resultSet.getString("SURNAME");
            String name = resultSet.getString("NAME");
            String patronymic = resultSet.getString("MIDDLE_NAME");
            String group = resultSet.getString("GROUP_NAME");
            student = new Student(id, surname, name, patronymic, group);
        } catch (SQLException e) {
            /*LOGS*/
        }
        return student;
    }

}
