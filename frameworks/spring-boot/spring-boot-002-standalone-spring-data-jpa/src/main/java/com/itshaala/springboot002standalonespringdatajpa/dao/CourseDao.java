package com.itshaala.springboot002standalonespringdatajpa.dao;

import com.itshaala.springboot002standalonespringdatajpa.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends CrudRepository<Course, Integer> {
}
