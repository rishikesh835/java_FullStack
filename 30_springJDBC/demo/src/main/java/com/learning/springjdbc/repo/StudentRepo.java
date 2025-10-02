package com.learning.springjdbc.repo;

import com.learning.springjdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
//        System.out.println("added");
        String sql = "INSERT INTO student (rollno, name, marks) VALUES (?, ?, ?)";
        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows + " row");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<Student>();
        return students;

    }
}
