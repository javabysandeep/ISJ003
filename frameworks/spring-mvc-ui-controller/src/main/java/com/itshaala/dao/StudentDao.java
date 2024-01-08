package com.itshaala.dao;

import com.itshaala.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        String sql = "insert into it_shaala.student(id, name, email, phone, address) values(?,?,?,?,?)";
        jdbcTemplate.update(sql, ps -> {
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhone());
            ps.setString(5, student.getAddress());
        });
    }
}
