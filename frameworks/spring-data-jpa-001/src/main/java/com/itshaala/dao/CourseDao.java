package com.itshaala.dao;

import com.itshaala.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends CrudRepository<Course, Integer> {

}
