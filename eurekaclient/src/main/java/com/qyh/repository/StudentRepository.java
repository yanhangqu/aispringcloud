package com.qyh.repository;

import com.qyh.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);

}
