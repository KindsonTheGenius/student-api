package com.kindsonthegenius.demos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.demos.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
